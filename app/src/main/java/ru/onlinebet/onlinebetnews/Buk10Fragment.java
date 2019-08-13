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


/**
 * A simple {@link Fragment} subclass.
 */
public class Buk10Fragment extends Fragment {


    public Buk10Fragment() {
    }

    TextView textView1, textView2, textView3, textView4;
    Button btn;

    public static Buk10Fragment newInstance() {
        return new Buk10Fragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buk10, container, false);
        getActivity().setTitle("Олимп");
        textView1 = view.findViewById(R.id.olimp_text1);
        textView1.setText("О конторе\n\n" +
                "БК Олимп создана на территории Казахстана 14 лет назад. С 2017 года компания ведёт легальную деятельность в РФ. Зарегистрирована контора в Москве и имеет все соответствующие лицензии, которые позволяют ей законно заниматься букмекерским бизнесом. В России Олимп имеет 15 наземных пунктов приёма ставок. Тем не менее, не все они находятся в больших городах.\n" +
                "\n" +
                "Интерфейс\n\n" +
                "Если говорить об интерфейсе сайта, то здесь всё просто и симпатично. Преобладают бордово-белые тона, не обошлось и без оформления в стиле Древней Греции. Некая отсылка к названию компании. Также можно найти раздел статистики, который ничем не отличается от аналогичной версии других контор, но всё необходимое там есть.");
        textView2 = view.findViewById(R.id.olimp_text2);
        textView2.setText("Линия\n\n" +
                "Линия БК Олимп довольно широкая. В топе представлены все самые популярные виды спорта. Есть и редкие соревнования, например, регби-союз. Минимально можно поставить 20 руб. БК Олимпне может похвастаться большими коэффициентами, но в целом они ничем не уступают средним показателям на рынке. Благодаря хорошей росписи контора имеет свою твёрдую позицию в сегменте.\n" +
                "\n" +
                "LIVE открывается на сайте моментально, полностью на линию можно взглянуть в специальном разделе. Однако, некоторые клиенты жалуются, что пользователи, которые не прошли регистрацию, видят более высокие коэффициенты, нежели верифицированные бетторы. Не лучший рекламный ход, мягко говоря.\n" +
                "\n" +
                "Регистрация\n\n" +
                "Чтобы пройти идентификацию через Первый ЦУПИС можно воспользоваться услугами партнеров конторы. В первую очередь нужно ввести свой мобильный номер. Затем нужно подойти в наземную точку букмекерская контора Олимп или в салон Евросеть с паспортом и гаджетом. Процедура займёт некое время, но взамен клиент получить надёжные и защищенные ставки.\n");
        textView3 = view.findViewById(R.id.olimp_text3);
        textView3.setText("Бонусы\n\n" +
                "БК Олимп не даёт своим клиентам приветственные бонусы. Компания проводит промо-акции и делает специальные предложения. БК Олимпможет предоставить беттору бонус при ставке на коэффициент 2,5 и больше.\n" +
                "\n" +
                "Вывод и ввод\n\n" +
                "Пополнить игровой счёт можно через платёжные системы QIWI, Яндекс Деньги, банковскую карту или с помощью операторов сотовой связи. Пополнить счёт можно и через наземный пункт БК Олимп. Минимально нужно закинуть на баланс 100 руб.\n" +
                "\n" +
                "Чтобы вывести деньги со счёта нужно указать ФИО, иначе вы можете не получить свои средства. Иногда процедура вывода занимает два дня. Так случается, если беттор хочет совершить транзакцию на карточку. Выводятся деньги аналогично вводу, через те же сервисы.\n" +
                "\n" +
                "Мобильная версия\n\n" +
                "БК Олимп рекомендует скачать приложения для смартфона и планшета, чтобы в любое время осуществлять ставки. Оно довольно удобное и ничем не отличается от десктопного варианта.\n" +
                "\n");
        textView4 = view.findViewById(R.id.olimp_text4);
        textView4.setText("Служба поддержки\n\n" +
                "Круглосуточная помощь доступна всем клиентам компании БК Олимп. Работает служба быстро и оперативно. При этом есть возможность связаться через e-mail, который указан на сайте, также можно найти телефонный номер для связи. Оператор проконсультирует по любым вопросам, которые связаны с работой БК Олимп.\n" +
                "\n");

        btn = view.findViewById(R.id.olimp_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://olimp.com/"));
                startActivity(browserIntent);
            }
        });
        return view;
    }

}
