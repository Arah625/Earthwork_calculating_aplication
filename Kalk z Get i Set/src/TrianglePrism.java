public class TrianglePrism {
    //dodać możliwość wyboru, czy obliczenia przeprowadzane są dla wykopu, czy nasypu
    private String trianglePrismBeginningChainage;
    private String trianglePrismClosingChainage;

    private float firstTriangleTopBase;
    private float firstTriangleBottomOrdinate;
    private float firstTriangleTopOrdinate1;
    private float firstTriangleTopOrdinate2;
    private float firstTriangleHeight;

    private float secondTriangleTopBase;
    private float secondTriangleBottomOrdinate;
    private float secondTriangleTopOrdinate1;
    private float secondTriangleTopOrdinate2;
    private float secondTriangleHeight;

    private float medialTriangleTopBase;
    private float medialTriangleBottomOrdinate;
    private float medialTriangleTopOrdinate1;
    private float medialTriangleTopOrdinate2;
    private float medialTriangleHeight;


    public String getTrianglePrismBeginningChainage() {
        return trianglePrismBeginningChainage;
    }

    public void setTrianglePrismBeginningChainage(String trianglePrismBeginningChainage) {
        if (trianglePrismBeginningChainage.isEmpty()) {
            System.out.println("Wrong extension");
        } else {
            this.trianglePrismBeginningChainage = trianglePrismBeginningChainage.replace("+", "");          //jeśli wprowadzono "," to zamiana na "." i oodwrotnie, , sprawdzenie poprawności formatu np. x+xxx,xx - yyyy+yyy,yy
        }
    }

    public String getTrianglePrismClosingChainage() {
        return trianglePrismClosingChainage;
    }

    public void setTrianglePrismClosingChainage(String trianglePrismClosingChainage) {
        if (trianglePrismClosingChainage.isEmpty()) {
            System.out.println("Wrong extension");
        } else {
            this.trianglePrismClosingChainage = trianglePrismClosingChainage.replace("+", "");          //jeśli wprowadzono "," to zamiana na ".", sprawdzenie poprawności formatu np. x+xxx,xx - yyyy+yyy,yy
        }
    }

    public float getFirstTriangleTopBase() {
        return firstTriangleTopBase;
    }

    public void setFirstTriangleTopBase(float firstTriangleTopBase) {
        this.firstTriangleTopBase = firstTriangleTopBase;
    }

    public float getFirstTriangleBottomOrdinate() {
        return firstTriangleBottomOrdinate;
    }

    public void setFirstTriangleBottomOrdinate(float firstTriangleBottomOrdinate) {
        this.firstTriangleBottomOrdinate = firstTriangleBottomOrdinate;
    }

    public float getFirstTriangleTopOrdinate1() {
        return firstTriangleTopOrdinate1;
    }

    public void setFirstTriangleTopOrdinate1(float firstTriangleTopOrdinate1) {
        this.firstTriangleTopOrdinate1 = firstTriangleTopOrdinate1;
    }

    public float getFirstTriangleTopOrdinate2() {
        return firstTriangleTopOrdinate2;
    }

    public void setFirstTriangleTopOrdinate2(float firstTriangleTopOrdinate2) {
        this.firstTriangleTopOrdinate2 = firstTriangleTopOrdinate2;
    }

    public float getFirstTriangleHeight() {
        return firstTriangleHeight;
    }

    public void setFirstTriangleHeight(float firstTriangleHeight) {
        this.firstTriangleHeight = firstTriangleHeight;
    }

    public float getSecondTriangleTopBase() {
        return secondTriangleTopBase;
    }

    public void setSecondTriangleTopBase(float secondTriangleTopBase) {
        this.secondTriangleTopBase = secondTriangleTopBase;
    }

    public float getSecondTriangleBottomOrdinate() {
        return secondTriangleBottomOrdinate;
    }

    public void setSecondTriangleBottomOrdinate(float secondTriangleBottomOrdinate) {
        this.secondTriangleBottomOrdinate = secondTriangleBottomOrdinate;
    }

    public float getSecondTriangleTopOrdinate1() {
        return secondTriangleTopOrdinate1;
    }

    public void setSecondTriangleTopOrdinate1(float secondTriangleTopOrdinate1) {
        this.secondTriangleTopOrdinate1 = secondTriangleTopOrdinate1;
    }

    public float getSecondTriangleTopOrdinate2() {
        return secondTriangleTopOrdinate2;
    }

    public void setSecondTriangleTopOrdinate2(float secondTriangleTopOrdinate2) {
        this.secondTriangleTopOrdinate2 = secondTriangleTopOrdinate2;
    }

    public float getSecondTriangleHeight() {
        return secondTriangleHeight;
    }

    public void setSecondTriangleHeight(float secondTriangleHeight) {
        this.secondTriangleHeight = secondTriangleHeight;
    }

    public float getMedialTriangleTopBase() {
        return medialTriangleTopBase;
    }

    public void setMedialTriangleTopBase(float medialTriangleTopBase) {
        this.medialTriangleTopBase = medialTriangleTopBase;
    }

    public float getMedialTriangleBottomOrdinate() {
        return medialTriangleBottomOrdinate;
    }

    public void setMedialTriangleBottomOrdinate(float medialTriangleBottomOrdinate) {
        this.medialTriangleBottomOrdinate = medialTriangleBottomOrdinate;
    }

    public float getMedialTriangleTopOrdinate1() {
        return medialTriangleTopOrdinate1;
    }

    public void setMedialTriangleTopOrdinate1(float medialTriangleTopOrdinate1) {
        this.medialTriangleTopOrdinate1 = medialTriangleTopOrdinate1;
    }

    public float getMedialTriangleTopOrdinate2() {
        return medialTriangleTopOrdinate2;
    }

    public void setMedialTriangleTopOrdinate2(float medialTriangleTopOrdinate2) {
        this.medialTriangleTopOrdinate2 = medialTriangleTopOrdinate2;
    }

    public float getMedialTriangleHeight() {
        return medialTriangleHeight;
    }

    public void setMedialTriangleHeight(float medialTriangleHeight) {
        this.medialTriangleHeight = medialTriangleHeight;
    }

    public float ConversionTrianglePrismStringBeginningChainageToFloat() {
        return Float.parseFloat(getTrianglePrismBeginningChainage());
    }

    public float ConversionTrianglePrismStringClosingChainageToFloat() {
        return Float.parseFloat(getTrianglePrismClosingChainage());
    }


    public float ConvertTrianglePrismStringChainageToFloatLength() {

        float solutionTrianglePrismStringChainageToFloatLength;

        solutionTrianglePrismStringChainageToFloatLength = (ConversionTrianglePrismStringClosingChainageToFloat() - ConversionTrianglePrismStringBeginningChainageToFloat());

        return solutionTrianglePrismStringChainageToFloatLength;
    }


    public float SolveForFirstTriangle() {
        float solutionForFirstTriangle;
        float firstTriangleHeightFromOrdinates;
        float firstTriangleAreaFromOrdinatesDifference;

        if (firstTriangleHeight <= 0) {
            firstTriangleHeightFromOrdinates = (((firstTriangleTopOrdinate1 + firstTriangleTopOrdinate2) / 2) - firstTriangleBottomOrdinate);
            firstTriangleAreaFromOrdinatesDifference = firstTriangleTopBase * firstTriangleHeightFromOrdinates / 2;
            return firstTriangleAreaFromOrdinatesDifference;
        } else {
            float firstTriangleArea = firstTriangleTopBase * firstTriangleHeight / 2;
            solutionForFirstTriangle = firstTriangleArea;
        }
        return solutionForFirstTriangle;
    }


    public float SolveForSecondTriangle() {
        float solutionForSecondTriangle;
        float secondTriangleHeightFromOrdinates;
        float secondTriangleAreaFromOrdinatesDifference;

        if (secondTriangleHeight <= 0) {
            secondTriangleHeightFromOrdinates = (((secondTriangleTopOrdinate1 + secondTriangleTopOrdinate2) / 2) - secondTriangleBottomOrdinate);
            secondTriangleAreaFromOrdinatesDifference = secondTriangleTopBase * secondTriangleHeightFromOrdinates / 2;
            return secondTriangleAreaFromOrdinatesDifference;
        } else {
            float secondTriangleArea = secondTriangleTopBase * secondTriangleHeight / 2;
            solutionForSecondTriangle = secondTriangleArea;
        }
        return solutionForSecondTriangle;
    }

    public float SolveForMedialTriangle() {
        float solutionForMedialTriangle;
        float medialTriangleHeightFromOrdinates;
        float medialTriangleAreaFromOrdinatesDifference;

        if (medialTriangleHeight <= 0) {
            medialTriangleHeightFromOrdinates = (((medialTriangleTopOrdinate1 + medialTriangleTopOrdinate2) / 2) - medialTriangleBottomOrdinate);
            medialTriangleAreaFromOrdinatesDifference = medialTriangleTopBase * medialTriangleHeightFromOrdinates / 2;
            return medialTriangleAreaFromOrdinatesDifference;
        } else {
            float medialTriangleArea = medialTriangleTopBase * medialTriangleHeight / 2;
            solutionForMedialTriangle = medialTriangleArea;
        }
        return solutionForMedialTriangle;
    }


    public float AverageCrossSectionMethodForTrianglePrism() {

        float trianglePrismVolumeAverageCrossSectionnMethod = (float) (0.5 * (SolveForFirstTriangle() + SolveForSecondTriangle()) * ConvertTrianglePrismStringChainageToFloatLength());

        return trianglePrismVolumeAverageCrossSectionnMethod;
    }

    public float MedialCrossSectionMethodForTrianglePrism() {

        float trianglePrismVolumeMedialCrossSectionnMethod = (float) (0.5 * SolveForMedialTriangle() * ConvertTrianglePrismStringChainageToFloatLength());

        return trianglePrismVolumeMedialCrossSectionnMethod;
    }


}