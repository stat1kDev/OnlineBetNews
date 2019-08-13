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
public class Buk6Fragment extends Fragment {


    public Buk6Fragment() {
    }

    TextView textView1, textView2, textView3, textView4;
    Button btn;

    public static Buk6Fragment newInstance() {
        return new Buk6Fragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buk6, container, false);
        getActivity().setTitle("1хСтавка");
        textView1 = view.findViewById(R.id.one_x_bet_text1);
        textView1.setText("О конторе\n\n" +
                "1xСтавка начала свою деятельность в 2010 году. Сайт принадлежит фирме Букмекер Паб. Действует контора на основе лицензии ФНС России. Зарегистрирована компания в городе Брянск. Всего существуют более 700 пунктов приёма ставок на территории РФ.\n" +
                "\n" +
                "Регистрация\n\n" +
                "Регистрацию в 1xСтавка можно пройти очень быстро, требуется лишь заполнение интуитивной и простой формы. Затем клиенту придёт подтверждающее письмо на e-mail. Однако для вывода средств необходимо подтверждение личности, которое нужно будет получить, заполнив анкету на сайте ЦУПИС. Привязав её к сайту, у вас будет возможность полноценно пользоваться услугами конторы. Стоит отметить, что для игры в БК необходимо иметь гражданство России.");
        textView2 = view.findViewById(R.id.one_x_bet_text2);
        textView2.setText("Бонусы\n\n" +
                "БК 1xСтавка даёт бонусв размере 4000 рублей максимум, но чтобы вывести средства нужно соблюдать правила, а именно проставить сумму бонуса в 3-кратном размере экспрессом. Каждый экспресс должен состоять минимум с трех событий, при этом три события должны содержать коэффициент не менее 1,5. Клиент может отказаться от бонуса при первом пополнении.\n" +
                "\n" +
                "Главная\n\n" +
                "Главная страница сайта очень удобная, слева находится главное меню, где вверху отображаются наиболее популярные виды спорта. Остальные можно найти ниже. Посередине экрана вы увидите LIVE линию с возможностью посмотреть онлайн-видеотрансляцию спортивного события. В верхнем меню можно выбрать любой раздел ставок, который вас интересует. По сути все очень удобно и каждому человеку будет просто разобраться.\n" +
                "\n" +
                "Линия\n\n" +
                "Линия понравится даже самому требовательному игроку. На сайте представлены топовые чемпионаты и лиги, а также различные события, которые даже не связаны со спортом. В линии вы найдете 32 вида спорта, это очень высокий уровень даже для мирового рынка. У 1xСтавка можно найти региональные чемпионаты, поставив на мелкие состязания. Роспись здесь также вполне приличная. К примеру, на топ поединок популярного европейского футбольного чемпионата БК предлагает больше 5000 вариантов ставки. Для НХЛ и НБА до одной тысячи. У 1xСтавка очень сильная линия LIVE ставок, которая позволяет заключить пари на очень большое разнообразие исходов. Почти каждый матч вы можете посмотреть в онлайне. В целом БК находится среди лидеров в мировом беттинге по коэффициентам. Также компания имеет такую полезную функцию как Матч-центр.\n" +
                "\n" +
                "Сайт\n\n" +
                "Компания предоставляет клиенту не только классический беттинг, но и ставки на многопользовательские игры. Сайт позволяет ставить на киберспорт и виртуальный спорт. Игровых автоматов, казино, биржи т.д. на данном ресурсе вы не увидите. Зато 1xСтавка позволяет продать ставочный купон. Его цену определит букмекер в зависимости от того, какая вероятность захода события. Минимальная сумма ставки равна 10 рублям.");
        textView3 = view.findViewById(R.id.one_x_bet_text3);
        textView3.setText("Мобильная версия\n\n" +
                "БК 1xСтавка имеет мобильную версию, которая отличается от обычной. Здесь нет Матч-центра, не показываются результаты в режиме Live и видеотрансляции. Владельцы устройств на основе IOS получают более качественный интерфейс приложения. На нём доступны все функции классического ресурса.\n" +
                "\n" +
                "Ввод и вывод средств\n\n" +
                "Пополнить счет можно с помощью популярных вариантов VISA/MasterCard, Qiwi, Яндекс Деньги и МонетаРу. Депозит можно совершить благодаря операторам сотовой сети МТС, Мегафон, Beeline, ЕВРОСЕТЬ, Tele2 и СВЯЗНОЙ. Пополнение происходит через авторизацию в ЦУПИС.\n" +
                "\n" +
                "Чтобы вывести деньги нужно указать телефонный номер, на который придёт уведомление с кодом. Сделав заявку, нужно подтвердить её на сайте ЦУПИС. 1xСтавка также информирует клиента о сумме налога, который будет вычтен при выводе средств.");
        textView4 = view.findViewById(R.id.one_x_bet_text4);
        textView4.setText("Служба поддержки\n\n" +
                "В связи с тем, что 1xСтавка сотрудничает с ЦУПИС, спорные ситуации игроки могут решать в свою пользу. Служба поддержки доступна все 24 часа. Связаться с ней можно через электронную почту и телефон, которые указаны на сайте букмекера.");

        btn = view.findViewById(R.id.one_x_bet_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://1xstavka.ru/"));
                startActivity(browserIntent);
            }
        });
        return view;
    }

}