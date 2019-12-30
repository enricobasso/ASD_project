public class MainNAIVE   {
    public static void main(String[] args) {
        /*
         Array initialization
         @TODO: input from System.in
         */
        //double[] input = {0.549178110022452, 0.405145922046684, 0.4856229941081591, 0.10658278333555671, 0.5000518600705458, 0.7437491210789988, 0.037904615535225616, 0.8154027628258288, 0.3185980081163632, 0.6683937892023177, 0.6213634966911162, 0.35473355275873575, 0.8332198116112027, 0.1723053601088923, 0.7454741403777418, 0.6271299484699213, 0.1378825819359797, 0.6023749485443667, 0.6789246973211434, 0.06419211399776303, 0.8162793078034709, 0.7482706642890472, 0.11888593040522344, 0.9156208687826942, 0.46191117388642333, 0.5440911679364423, 0.28511610535133025, 0.726636170314028, 0.18576328034759715, 0.7121816655192645, 0.8771652493547185, 0.9744922655311266, 0.11673370801458238, 0.09377185096746155, 0.4120428447347487, 0.6404873490383513, 0.9946995162503398, 0.8573843402487593, 0.8200651948000074, 0.8307792594965936, 0.8320804039392222, 0.2535009882466128, 0.8182001637970087, 0.42748333153022744, 0.27698713484495396, 0.09276388403143432, 0.5030783033447221, 0.15094212159075093, 0.7495186189945912, 0.6650264410739999, 0.8099412941160964, 0.3447209815749187, 0.6424977384218887, 0.3878597583848099, 0.9691499020144632, 0.25679748443729267, 0.8789128453611421, 0.07565743571462968, 0.8584752561838596, 0.5835769436985472, 0.9005582858360026, 0.35427234883647196, 0.1972492614925322, 0.5677798940676735, 0.7258441161996991, 0.4111567760774779, 0.8575505128942071, 0.9969119928915311, 0.059471237164116064, 0.9672672893369932, 0.17795498309822155, 0.03594045447036276, 0.5626452722457814, 0.08453397340226565, 0.0569810312794824, 0.9459653762525164, 0.29972881761303094, 0.18148375036216058, 0.77621078691099, 0.3900883826853301, 0.06570812681357863, 0.41964528666561585, 0.9571709441127245, 0.20834512256934412, 0.7685772393244773, 0.444653155665396, 0.7914079317737888, 0.2554818323025623, 0.2917187645994527, 0.31850749070741646, 0.6997937981025686, 0.13852104463694204, 0.29358724498938116, 0.36323421522126975, 0.8749505612387366, 0.4654744363556611, 0.215477526324519, 0.5512308815013184, 0.739782990080432, 0.5222262687676517};
        //double[] input = {0.1, 0.35, 0.05, 0.1, 0.15, 0.05, 0.2};
        //double[] input = {0.2, 0.1, 0.15, 0.05, 0.2, 0.1, 0.1, 0.05, 0.2, 0.2};
        /*
            0.05
            0.05
            0.1
            0.1
            0.15
            0.2
            0.35
        */
        /*for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }*/
    	InputGetter inputHandler = new InputGetter(null);
        System.out.println(execute(inputHandler.getInput()));
    }

    public static double execute(double[] input) {
    	double middleArraySum = 0;
        for (int i = 0; i < input.length; i++) {
            middleArraySum = middleArraySum + input[i];
        }

        middleArraySum = middleArraySum / 2;

        for (int i = 0; i < input.length; i++) {
            double leftSum = 0;
            double rightSum = 0;
            for (int j = 0; j < input.length; j++) {
                if (input[j] < input[i]) {
                    leftSum = leftSum + input[j];
                    rightSum = rightSum + input[j];
                } else if (input[j] == input[i]) {
                    rightSum = rightSum + input[j];
                }
            }
            if (leftSum < middleArraySum && middleArraySum <= rightSum) {
                return input[i];
            }
        }

        return -1;
    }
}
