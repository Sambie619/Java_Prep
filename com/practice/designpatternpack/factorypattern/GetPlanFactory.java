package designpatternpack.factorypattern;

public class GetPlanFactory {

    public enum PlanType {
        DOMESTIC,
        COMMERCIAL,
        INSTITUTIONAL
    }

    public Plan getPlan(PlanType planType) {

        if (planType == null) {
            throw new IllegalArgumentException("Plan type cannot be null");
        }

        switch (planType) {
            case DOMESTIC:
                return new DomesticPlan();

            case COMMERCIAL:
                return new CommercialPlan();

            case INSTITUTIONAL:
                return new InstitutionalPlan();

            default:
                throw new IllegalArgumentException("Invalid plan type");
        }
    }
}

//this factory decides which obj to create