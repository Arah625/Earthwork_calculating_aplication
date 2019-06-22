public class TrapeziumPrism {

    private String BeginningChainage;
    private String ClosingChainage;
    private float firstTopBase;
    private float firstBottomBase;
    private float firstBottomOrdinate1;
    private float firstBottomOrdinate2;
    private float firstTopOrdinate1;
    private float firstTopOrdinate2;
    private float firstHeight;

    private float secondTopBase;
    private float secondBottomBase;
    private float secondBottomOrdinate1;
    private float secondBottomOrdinate2;
    private float secondTopOrdinate1;
    private float secondTopOrdinate2;
    private float secondHeight;

    private float medialTopBase;
    private float medialBottomBase;
    private float medialBottomOrdinate1;
    private float medialBottomOrdinate2;
    private float medialTopOrdinate1;
    private float medialTopOrdinate2;
    private float medialHeight;

    private float topWidthForSimpsonMethod;
    private float topLengthForSimpsonMethod;
    private float bottomWidthForSimpsonMethod;
    private float bottomLengthForSimpsonMethod;
    private float topOrdinate1ForSimpsonMethod;
    private float topOrdinate2ForSimpsonMethod;
    private float bottomOrdinate1ForSimpsonMethod;
    private float bottomOrdinate2ForSimpsonMethod;
    private float heightForSimpsonMethod;

    public String getBeginningChainage() {
        return BeginningChainage;
    }

    public void setBeginningChainage(String beginningChainage) {
        if (beginningChainage.isEmpty()) {
            System.out.println("Wrong extension");
        } else {
            this.BeginningChainage = beginningChainage.replace("+", "");
        }
    }

    public String getClosingChainage() {
        return ClosingChainage;
    }

    public void setClosingChainage(String closingChainage) {
        if (closingChainage.isEmpty()) {
            System.out.println("Wrong extension");
        } else {
            this.ClosingChainage = closingChainage.replace("+", "");
        }
    }

    public void setFirstTopBase(float firstTopBase) {
        this.firstTopBase = firstTopBase;
    }

    public void setFirstBottomBase(float firstTrapeziumBottomBase) {
        this.firstBottomBase = firstTrapeziumBottomBase;
    }

    public void setFirstBottomOrdinate1(float firstBottomOrdinate1) {
        this.firstBottomOrdinate1 = firstBottomOrdinate1;
    }

    public void setFirstBottomOrdinate2(float firstBottomOrdinate2) {
        this.firstBottomOrdinate2 = firstBottomOrdinate2;
    }

    public void setFirstTopOrdinate1(float firstTopOrdinate1) {
        this.firstTopOrdinate1 = firstTopOrdinate1;
    }

    public void setFirstTopOrdinate2(float firstTopOrdinate2) {
        this.firstTopOrdinate2 = firstTopOrdinate2;
    }

    public void setFirstHeight(float firstHeight) {
        this.firstHeight = firstHeight;
    }

    public void setSecondTopBase(float secondTopBase) {
        this.secondTopBase = secondTopBase;
    }

    public void setSecondBottomBase(float secondBottomBase) {
        this.secondBottomBase = secondBottomBase;
    }

    public void setSecondBottomOrdinate1(float secondBottomOrdinate1) {
        this.secondBottomOrdinate1 = secondBottomOrdinate1;
    }

    public void setSecondBottomOrdinate2(float secondBottomOrdinate2) {
        this.secondBottomOrdinate2 = secondBottomOrdinate2;
    }

    public void setSecondTopOrdinate1(float secondTopOrdinate1) {
        this.secondTopOrdinate1 = secondTopOrdinate1;
    }

    public void setSecondTopOrdinate2(float secondTopOrdinate2) {
        this.secondTopOrdinate2 = secondTopOrdinate2;
    }

    public void setSecondHeight(float secondHeight) {
        this.secondHeight = secondHeight;
    }

    public void setMedialTopBase(float medialTopBase) {
        this.medialTopBase = medialTopBase;
    }

    public void setMedialBottomBase(float medialBottomBase) {
        this.medialBottomBase = medialBottomBase;
    }

    public void setMedialBottomOrdinate1(float medialBottomOrdinate1) {
        this.medialBottomOrdinate1 = medialBottomOrdinate1;
    }

    public void setMedialBottomOrdinate2(float medialBottomOrdinate2) {
        this.medialBottomOrdinate2 = medialBottomOrdinate2;
    }

    public void setMedialTopOrdinate1(float medialTopOrdinate1) {
        this.medialTopOrdinate1 = medialTopOrdinate1;
    }

    public void setMedialTopOrdinate2(float medialTopOrdinate2) {
        this.medialTopOrdinate2 = medialTopOrdinate2;
    }

    public void setMedialHeight(float medialHeight) {
        this.medialHeight = medialHeight;
    }

    public void setTopWidthForSimpsonMethod(float topWidthForSimpsonMethod) {
        this.topWidthForSimpsonMethod = topWidthForSimpsonMethod;
    }

    public void setTopLengthForSimpsonMethod(float topLengthForSimpsonMethod) {
        this.topLengthForSimpsonMethod = topLengthForSimpsonMethod;
    }

    public void setBottomWidthForSimpsonMethod(float bottomWidthForSimpsonMethod) {
        this.bottomWidthForSimpsonMethod = bottomWidthForSimpsonMethod;
    }

    public void setBottomLengthForSimpsonMethod(float bottomLengthForSimpsonMethod) {
        this.bottomLengthForSimpsonMethod = bottomLengthForSimpsonMethod;
    }

    public void setTopOrdinate1ForSimpsonMethod(float topOrdinate1ForSimpsonMethod) {
        this.topOrdinate1ForSimpsonMethod = topOrdinate1ForSimpsonMethod;
    }

    public void setTopOrdinate2ForSimpsonMethod(float topOrdinate2ForSimpsonMethod) {
        this.topOrdinate2ForSimpsonMethod = topOrdinate2ForSimpsonMethod;
    }

    public void setBottomOrdinate1ForSimpsonMethod(float bottomOrdinate1ForSimpsonMethod) {
        this.bottomOrdinate1ForSimpsonMethod = bottomOrdinate1ForSimpsonMethod;
    }

    public void setBottomOrdinate2ForSimpsonMethod(float bottomOrdinate2ForSimpsonMethod) {
        this.bottomOrdinate2ForSimpsonMethod = bottomOrdinate2ForSimpsonMethod;
    }

    public void setHeightForSimpsonMethod(float heightForSimpsonMethod) {
        this.heightForSimpsonMethod = heightForSimpsonMethod;
    }

    public float ConvertStringBeginningChainageToFloat() {
        return Float.parseFloat(getBeginningChainage());
    }

    public float ConvertStringClosingChainageToFloat() {
        return Float.parseFloat(getClosingChainage());
    }

    public float ConvertStringChainageToFloatLength() {

        return (ConvertStringClosingChainageToFloat() - ConvertStringBeginningChainageToFloat());
    }

    public float SolveForFirstTrapezium() {
        float solutionForFirstTrapezium;
        float firstTrapeziumHeightFromOrdinates;
        float firstTrapeziumAreaFromOrdinatesDifference;

        if (firstHeight <= 0) {
            firstTrapeziumHeightFromOrdinates = (((firstTopOrdinate1 + firstTopOrdinate2) / 2) - ((firstBottomOrdinate1 + firstBottomOrdinate2) / 2));
            firstTrapeziumAreaFromOrdinatesDifference = firstTopBase * firstTrapeziumHeightFromOrdinates / 2;
            return firstTrapeziumAreaFromOrdinatesDifference;
        } else {
            float firstTrapeziumArea = firstTopBase * firstHeight / 2;
            solutionForFirstTrapezium = firstTrapeziumArea;
        }
        return solutionForFirstTrapezium;
    }


    public float SolveForSecondTrapezium() {
        float solutionForSecondTrapezium;
        float secondTrapeziumHeightFromOrdinates;
        float secondTrapeziumAreaFromOrdinatesDifference;

        if (secondHeight <= 0) {
            secondTrapeziumHeightFromOrdinates = (((secondTopOrdinate1 + secondTopOrdinate2) / 2) - ((secondBottomOrdinate1 + secondBottomOrdinate2) / 2));
            secondTrapeziumAreaFromOrdinatesDifference = secondTopBase * secondTrapeziumHeightFromOrdinates / 2;
            return secondTrapeziumAreaFromOrdinatesDifference;
        } else {
            float secondTrapeziumArea = secondTopBase * secondHeight / 2;
            solutionForSecondTrapezium = secondTrapeziumArea;
        }
        return solutionForSecondTrapezium;
    }

    public float SolveForMedialTrapezium() {
        float solutionForMedialTrapezium;
        float medialTrapeziumHeightFromOrdinates;
        float medialTrapeziumAreaFromOrdinatesDifference;

        if (medialHeight <= 0) {
            medialTrapeziumHeightFromOrdinates = (((medialTopOrdinate1 + medialTopOrdinate2) / 2) - ((medialBottomOrdinate1 + medialBottomOrdinate2) / 2));
            medialTrapeziumAreaFromOrdinatesDifference = medialTopBase * medialTrapeziumHeightFromOrdinates / 2;
            return medialTrapeziumAreaFromOrdinatesDifference;
        } else {
            float medialTrapeziumArea = medialTopBase * medialHeight / 2;
            solutionForMedialTrapezium = medialTrapeziumArea;
        }
        return solutionForMedialTrapezium;
    }

    public float SolveForTopTrapeziumArea() {
        float solutionForTopTrapeziumArea;

        if (ConvertStringChainageToFloatLength() != 0) {
            return solutionForTopTrapeziumArea = topWidthForSimpsonMethod * ConvertStringChainageToFloatLength();
        } else {
            return solutionForTopTrapeziumArea = topWidthForSimpsonMethod * topLengthForSimpsonMethod;
        }
    }

    public float SolveForBottomTrapeziumArea() {
        float solutionForBottomTrapeziumArea;

        if (ConvertStringChainageToFloatLength() != 0) {
            return solutionForBottomTrapeziumArea = bottomWidthForSimpsonMethod * ConvertStringChainageToFloatLength();
        } else {
            return solutionForBottomTrapeziumArea = bottomWidthForSimpsonMethod * bottomLengthForSimpsonMethod;
        }
    }

    public float SolveForMedialTrapeziumAreaParallelToTopAndBottom() {
        float solutionForMedialTrapeziumAreaToTopAndBottom;

        if (ConvertStringChainageToFloatLength() > 0) {
            return solutionForMedialTrapeziumAreaToTopAndBottom = (((topWidthForSimpsonMethod + bottomWidthForSimpsonMethod) / 2) * ConvertStringChainageToFloatLength());
        } else {
            return solutionForMedialTrapeziumAreaToTopAndBottom = (((topWidthForSimpsonMethod + bottomWidthForSimpsonMethod) / 2) * (topLengthForSimpsonMethod + bottomLengthForSimpsonMethod) / 2);
        }
    }

    public float AverageCrossSectionMethodForTrapeziumPrism() {

        float trapeziumPrismVolumeAverageCrossSectionnMethod = (float) (0.5 * (SolveForFirstTrapezium() + SolveForSecondTrapezium()) * ConvertStringChainageToFloatLength());

        return trapeziumPrismVolumeAverageCrossSectionnMethod;
    }

    public float SimpsonMethodForTrapeziumPrism() {

        if (heightForSimpsonMethod > 0) {
            float trapeziumPrismVolumeSimpsonMethod = (float) ((heightForSimpsonMethod / 6) * (SolveForTopTrapeziumArea() + SolveForBottomTrapeziumArea() + 4 * SolveForMedialTrapeziumAreaParallelToTopAndBottom()));
            return trapeziumPrismVolumeSimpsonMethod;
        } else {
            float trapeziumPrismVolumeSimpsonMethodFromOrdinates = (float) (((((topOrdinate1ForSimpsonMethod + topOrdinate2ForSimpsonMethod) / 2) - ((bottomOrdinate1ForSimpsonMethod + topOrdinate2ForSimpsonMethod) / 2)) / 6) * (SolveForTopTrapeziumArea() + SolveForBottomTrapeziumArea() + 4 * SolveForMedialTrapeziumAreaParallelToTopAndBottom()));
            return trapeziumPrismVolumeSimpsonMethodFromOrdinates;
        }
    }

    public float MedialCrossSectionMethodForTrapeziumPrism() {

        float trapeziumPrismVolumeMedialCrossSectionnMethod = (float) (0.5 * SolveForMedialTrapezium() * ConvertStringChainageToFloatLength());

        return trapeziumPrismVolumeMedialCrossSectionnMethod;
    }


}