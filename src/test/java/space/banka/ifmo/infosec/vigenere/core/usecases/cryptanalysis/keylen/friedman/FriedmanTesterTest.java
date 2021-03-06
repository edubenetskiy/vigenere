package space.banka.ifmo.infosec.vigenere.core.usecases.cryptanalysis.keylen.friedman;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FriedmanTesterTest {

    private FriedmanTester subject = new FriedmanTester();

    @Disabled
    @Test
    void test() {
        var ciphertext =
                "МЫГОПЦСВЦРПБЬБЖБЧЫЪШДЬЪЮОРПУЪНЖЫПЬГБПЦЛЬЛЕИДХЧГЗЧНГЖБРЛГЧЧГЮ" +
                "ЦЛЗДХЕКДШШВДЛЧЩМЪХСОККУЦНПГИЧБРДЫШХЯЫЛИЯЫРНЬЩЖАЗШШКГТХХИЧЩМЩ" +
                "ППГГТРИХОРЖЕЧЩЮЫКНЦЯЮНЮГКХМЪТБЛТПШЯЗЫШЭИПХЪЗЫНЮЩЪРБЫКЩОЬОЫРЧ" +
                "МХЭБЧЫЪВЦРЛЬЧМЩОКУЛДЩЛЕЫЩЛДЧЗГГГПХГЕДЦАВПЫРДЫШБДАЬМШДЩМБЦШПИ" +
                "ЕИЖЗШШИУСШАЧЫЖСЩФРЗЧЫРИУЦЕГЕПЪПЕПФРЯМЕМИУЪЩЩБУГЗИПИЦЦУУЗАЛПИ" +
                "ФУАТХЫИКАЛГВЧЧЖЕЬОЮБТЫЪЗЫЛОЧФУПУМРОГЬЬЪЗИНМШДПГГЦШГАКФМЯЫШБЬ" +
                "ЩШЖЫКСГЮКФИЯЦЛИОТЬЮИПХГЯОРОЭКЬЪЗИЩМЫКХЪППШРЮКНГЗДШРЫПХЭХВРЖГ" +
                "КВКЯЩШРГПНГЫЧЦМЪЧЩСЪККВКЮШАГДЦЖЯЭУЕЯАРПАТЦЖКМРХУИЦЖЦПГГГПТЛЧ" +
                "ФФЮАЩЛЕЩПЪЛКЫЫЭЗЧМЩИТКЛДЬСГШДХБДЫШАЗЖЧРКСУЮЮХШКДУЭЛКЫЖПЦМЧЖМ" +
                "ЛЪМЫИЩМАЧЦЛЧЫРАЕЧУПАКЯЗДМВЮЯФУЗЖЬСЗЯИЩОДОШИЭКХОЧЪЫСЭОЛРУЖЬЖЕ" +
                "ЬОИЯМЕГБЗПЖЫЬЦЮБИЩММЧСЖГКЧГАЧЬМЖДЯСОПЧЩМЖФПЕПЪЖВПЧРЧЫШОДМШХЬ" +
                "ЦЖСЕЧЪЛТЮШХЬЦЖРЖЬПМБЗМЖЩДЯЛДЦЛХЯЪЬМБТВГГЦЕУЩЧШЯЖКСГГТКЖЕЧЗРД" +
                "ХЭМОПЧЪДЪЬМЖЧСЛТЮЩМБЬБЖЩЦРРЖТНЖЧФЖЛТТЪГЮЬХЪИКЬМГТВЮЖКЯЮХЫЫЭД" +
                "ЫЧГЪЧЩМЗШРЦГЧШЯСИЫЛЦЗЬГЪЧЧГОТЫРДЫШЖФУЫНЬЩУКЬЦЬЮЯЭЛЗИТБГЗУУСМ" +
                "ЧПЭИЧЬЛДМШБДШШРДХЭХИЧЫИЯБФМВЪСЖБТЫЪЗЧЫРЧЩЕККЗЬЛДЬХМЭПЧЛТХННЖ" +
                "ППГБДЛАИЧЪЖИПЬЛДТЬГДЩУЖЦЬСГДЛПСВДНЮБУШГАКФЖЬЖФПЕПЪЖВПЧРТЪФЛЯ" +
                "НШЖЕПЪГЩПЪРТБРКДЦЛНДШЪГЭЦРККФРДЧФЛЛЧШШВДУШЛГТФГЯЛЕИЧЫРНЬЩЖНД" +
                "ЪХГЫЦУКЯСОЛЧЦЧЖАЧЦМБОЪЖЫРЛПЪЧНМЖИГЖВСРОАКХМВТЫФТУЛЛУПЦСВПЧЭШ" +
                "ДХМГПЫЗДФЖЗДМШНЖЧЫМЩУФМИЬНЮЗТХЖХОЛЖЖЬЫЮБУЛДЯМЭЧЧИЧЮЫЬМГЕЩРВЗ" +
                "ЫЛАБИХЮДШЪГЫПХГГЦЕЖЯЦЬГЖПЫУДЫКАЖПЦГГКЦЖВЦРЗЧСЛИДЪЖХИЧШЛЧЫШКГ" +
                "ПНПЬЫЛЗЯШЪЖЗЦУИЧЪЖЭГТБГЪЧЧГЯХРЬЕЩШРЯМЪСЗКХМАЦШЛЬШЪГЫЪЬЮЩФКЬЗ" +
                "ПМГАКФМГТЦМЪЬЬИЧСУРУШШВЬЩРАУИЦУДЫКПЫЩЭБДТЫРДЩШЛТАРЦКИ";

        double languageCoincidence = 0.0553;

        double estimatedKeySize = subject.estimateKeySize(ciphertext, languageCoincidence);
        assertEquals(4., estimatedKeySize, 0.5);
    }
}
