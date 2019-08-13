package ru.onlinebet.onlinebetnews;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Buk15Fragment extends Fragment {

    public Buk15Fragment() {
    }

    TextView textView1;
    Button btn;

    public static Buk15Fragment newInstance() {
        return new Buk15Fragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buk15, container, false);
        getActivity().setTitle("Балтбет");
        textView1 = view.findViewById(R.id.balt_bet_text1);
        textView1.setText("История компании Балтбет начинается с пункта приема ставок, открытого еще в 2003-м году. С тех пор ребята добились ощутимого прогресса и сейчас узнаваемы на российском рынке. Балтбет имеет свою уникальную фишку – «СуперЭкспресс», что выделяет компанию на фоне конкурентов. С помощью этой услуги вы можете получить внушительный суперприз, угадав минимум девять событий из 15-ти. Регулярные акции и бонусы поддерживают интерес к компании на должном уровне, оставляя ее популярной в пределах России.\n" +
                "\n" +
                "Интерфейс\n\n" +
                "Сайт компании имеет нестандартный и удобный интерфейс, позволяющий быстро найти все необходимое. Внешне сайт выделяется среди конкурентов своей самобытностью и фирменным стилем. В левой части экрана расположено меню live-ставок, с помощью чего можно быстро найти интересующее вас событие.\n" +
                "\n" +
                "Более того, команда Балтбет уделила внимание и описанию предстоящих спортивных событий, оставляя за собой актуальный, на их взгляд, прогноз. И, следует сказать, что расписан он зачастую весьма толково. Хотя ощущение странное: БК играет, по сути, против себя самой. Внизу же расположена лента новостей компании, оповещающая пользователя о нововведениях и свежих новостях. Так что в плане аналитических материалов Балтбет сумел обойти конкурентов.\n" +
                "\n" +
                "Линия и коэффициенты\n\n" +
                "Балтбет не может похвастать ни качественно расписанной линией, ни высокими коэффициентами. Более того, на топовые события коэффициенты зачастую занижаются. Зато выделились ребята в режиме live-ставок, предложив пользователю углубленную роспись событий, а также возможность составить экспресс из нескольких исходов одного и того же поединка. Ориентирована букмекерская контора на футбол, хотя и другие виды спорта представлены в должной мере. Всего же их 26, попадаются и крайне экзотические.\n" +
                "\n" +
                "Ввод/вывод средств\n\n" +
                "Компания не предлагает приветственных бонусов, однако и процесс регистрации достаточно прост, он не займет у вас много времени. К тому же, с вас не будет взыматься комиссия за вывод средств в большинстве случаев. Пополнить свой счет можно с помощью:\n" +
                "\n" +
                "   - Банковских карт (Visa, Visa Electron, MasterCard, Maestro)\n" +
                "   - WebMoney\n" +
                "   - Яндекс.Деньги\n" +
                "   - Visa QIWI Wallet\n" +
                "   - Кошельков Элекснет\n" +
                "   - Систем Сбербанк Онлайн\n" +
                "   - Comepay\n" +
                "   - Банковских отделений (Альфа-Банк, Промсвязьбанк, HandyBank)\n" +
                "   - Операторов мобильной связи (МТС, Beeline, Megafon, TELE2)\n" +
                "   - Оплаты счета посредством терминала\n" +
                "   - Салонов мобильной связи: \"Связной\" и \"Евросеть\"\n" +
                "Для вывода денег можно использовать кошельки WebMoney и Visa QIWI Wallet, Яндекс.Деньги или же банковские карты.\n" +
                "\n" +
                "Итог\n\n" +
                "Стоит отметить, несмотря на узкую направленность букмекерской конторы Балтбет, ребята не потерялись целиком на фоне конкурентов. В первую очередь, аналитика предстоящих событий держат компанию на плаву. Из минусов можно отметить отсутствие видеотрансляций на сайте, что затрудняет игру в live. Компенсируется это полнотой линии live-событий, чему уделяют время далеко не все конторы. Данный букмекер подойдет для тех, кто ценит простой функционал, а также периодически хочет испытать удачу в «СуперЭкспрессе».");
        btn = view.findViewById(R.id.balt_bet_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.baltbet.ru/"));
                startActivity(browserIntent);
            }
        });
        return view;
    }

}
