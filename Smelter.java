
/**
 * example: penny says this is how i smelt, pulls the coin object and use that
 * the smelt. the penny says this is my smelthing stragy
 * 
 * the .smelt method here would call the .smelt method in the delegate use be
 * able to just say .smelt
 * 
 * 
 * @author team 1
 *
 */
interface Smelter {

    public void smelt();
}

/**
 * if you are in this group than use this method.
 * 
 * @author team 1
 *
 */
class spec88Cu6Zi35Mn2Ni implements Smelter {

    @Override
    public void smelt() {
        System.out.println(" 88.5% Cu 6% Zi 3.5% Mn 2% Ni ");

    }

    /**
     * if you are in this group than use this method.
     * 
     * @author team 1
     *
     */
    class spec9167Cu833Ni implements Smelter {

        @Override
        public void smelt() {
            System.out.println(" 91.67% Cu 8.33% Ni ");

        }

    }

    /**
     * if you are in this group than use this method.
     * 
     * @author team 1
     *
     */
    class spec75Cu25Ni implements Smelter {

        @Override
        public void smelt() {
            System.out.println(" 75% Cu 25% Ni ");

        }

    }

    /**
     * if you are in this group than use this method.
     * 
     * @author team 1
     *
     */
    class spec25Cu975Zi implements Smelter {

        @Override
        public void smelt() {
            System.out.println(" 2.5% Cu 97.5% Zi ");

        }

    }

    /**
     * if you are in this group than use this method.
     * 
     * @author team 1
     *
     */
    class specUnknown implements Smelter {

        @Override
        public void smelt() {
            System.out.println(" unknown ");
        }

    }

    /**
     * if you are in this group than use this method.
     * 
     * @author team 1
     *
     */
    class specOR76204IR7525 implements Smelter {

        @Override
        public void smelt() {
            System.out.println(" outer ring: 76% Cu 20% Zi 4% Ni\r\n" + "inner ring: 75% Cu 25% Ni ");

        }

    }

    /**
     * if you are in this group than use this method.
     * 
     * @author team 1
     *
     */
    class spec70Cu245Zi55Ni implements Smelter {

        @Override
        public void smelt() {
            System.out.println(" 70% Cu 24.5% Zi 5.5% Ni ");

        }

    }

    /**
     * if you are in this group than use this method.
     * 
     * @author team 1
     *
     */
    class spec84Cu16Ni implements Smelter {

        @Override
        public void smelt() {
            System.out.println(" 84% Cu 16% Ni ");

        }

        /**
         * if you are in this group than use this method.
         * 
         * @author team 1
         *
         */
        class specCuPlatedSteel implements Smelter {

            @Override
            public void smelt() {
                System.out.println(" Cu plated steel ");

            }

        }

    }
}
