package ru.onlinebet.onlinebetnews;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Buk2Fragment extends Fragment {

    public Buk2Fragment() {

    }

    TextView textView1, textView2, textView3, textView4;
    Button btn;

    public static Buk2Fragment newInstance() {
        return new Buk2Fragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buk2, container, false);
        getActivity().setTitle("Фонбет");
        textView1 = view.findViewById(R.id.fonbet_text1);
        textView1.setText("О компании\n\n" +
                "Начала свою работу компания БК Фонбет еще в 1994 году. Фирма распространена по просторам стран СНГ. В России деятельность сайта Фонбет была под запретом, но осенью 2016 и уже в начале 2017 года контора снова смогла вести полноценную онлайн деятельность на территории РФ. Также контора имеет множество наземных пунктов ставок по всей стране. Компания является настоящим мастодонтом в мировом беттинге, запустив свой сайт весьма давно. Лицензию компании выдали в России. Контора получила шесть наград. Первую в 2015 году в номинации Бухгалтер Года, потом в этом же году, как лучшая сеть БК, спустя год Фонбет выиграл в номинации Национальный знак качества Выбор России, а также как Лучшая букмекерская сеть и Лучшая рекламная кампания года. В 2017 году фирма получила приз Лучшая букмекерская сеть года.\n" +
                "\n" +
                "Бонусы\n\n" +
                "БК Фонбет предлагает своим новым пользователям фрибет в размере 10 тыс. руб. Ставить можно любые ставки и по любым коэффициентам.\n" +
                "\n" +
                "Для начала пройдите регистрацию на сайте Фонбет и идентифицируйте свою личность. Потом совершите первое пополнение на сумму от 500 рублей. Заключите пари на событие с коэффициентом не меньше 2,0 на сумму первого депозита и получите первые две свободные ставки. Их сумма составляет 10 % процентов от первого пополнения. Фрибет доступен на общую сумму до 10 тысяч рублей.");
        textView2 = view.findViewById(R.id.fonbet_text2);
        textView2.setText("Регистрация\n\n" +
                "Регистрация на сайте крайне простая, вам просто нужно заполнить анкету со своими данными, и собственно все. Никаких сложностей клиент при этом не испытает.\n" +
                "\n" +
                "Главная\n\n" +
                "Некоторые пользователи жаловались на то, что на главной странице сайта больше половины места занимают новости фирмы и только вверху и сбоку можно перейти на линию ставок и самых интересных событий. Теперь на главной посередине находится LIVE-линия и перечень самых интересных предстоящих событий в мире спорта. Сайт выполнен довольно просто, ничего излишне красочного.\n" +
                "\n" +
                "Линия\n\n" +
                "Для обычного беттера контора не будет отличаться ничем от других вариантов. В наличии все самые популярные виды спорта, чемпионаты и лиги. Коэффициенты на среднем уровне, однако очень хорошая роспись. Можно поставить на довольно большое количество исходов в одной встрече. В разделе LIVE все примерно то же самое, на высоком уровне. Фонбет дает возможность объединить в экспрессе ставку из обычной линии и вариант в режиме LIVE. Весьма интересная функция. Минимальная сумма ставки 20 рублей.");
        textView3 = view.findViewById(R.id.fonbet_text3);
        textView3.setText("Сайт\n\n" +
                "Среди других вариантов ставок на сайте присутствует тотализатор и виртуальный спорт. Есть раздел результатов и статистики, однако многие пользователи жалуются на них и считают некомфортными и неудобными для глаз. При положительном балансе счета вы можете посмотреть определенные видеотрансляции спортивных событий.\n" +
                "\n" +
                "Мобильная версия\n\n" +
                "БК Фонбет дает возможность скачать для клиентов приложения Android и AppStore. Сделать это можно непосредственно на самом сайте компании. Трансляции важных матчей вы можете посмотреть прямо со своего айфона. Также можно скачать даже приложения для платформы Java.\n" +
                "\n" +
                "Ввод и вывод средств\n\n" +
                "БК Фонбет поддерживает все самые популярные платежные системы для пополнения и вывода денег из игрового счета. Это VISA, MasterCard, WebMoney, Яндекс Деньги, QIWI, Beeline, МТС, Мегафон и Tele2. Ставки можно проводить лишь в рублях.");
        textView4 = view.findViewById(R.id.fonbet_text4);
        textView4.setText("Служба поддержки\n\n" +
                "На сайте работает служба поддержки по телефону и путем обращения по электронной почте. LIVE-чата на БК Фонбет нет. Для звонка нужно быть клиентом конторы, при этом служба позволяет решить не только спорные вопросы, но и дает возможность пользователям узнать о результатах совершенных ставок и событий в спортивном мире, которые уже завершились.\n");

        btn = view.findViewById(R.id.fonbet_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fonbet.ru/promo/freebet100004/?partner=100057_HDAATEABBABA2019080510000093767721"));
                startActivity(browserIntent);
            }
        });
        return view;
    }


}
