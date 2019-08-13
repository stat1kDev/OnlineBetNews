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

public class Buk5Fragment extends Fragment {


    public Buk5Fragment() {
    }

    TextView textView1, textView2, textView3, textView4;
    Button btn;

    public static Buk5Fragment newInstance() {
        return new Buk5Fragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buk5, container, false);
        getActivity().setTitle("Betcity");
        textView1 = view.findViewById(R.id.betcity_text1);
        textView1.setText("Бонусы\n\n" +
                "Букмекерская контора Бетсити дает возможность получить бонус до 5 000 рублей всем новым клиентам компании. Чтобы стать участником программы, следует пополнить счет от 500 рублей. Размер бонус Бетсити равен 50% суммы первого пополнения. Таким образом, для зачисления на бонусный счет 5 000 рублей, вам необходимо ввести на депозит 10 000.\n" +
                "\n" +
                "Регистрация\n\n" +
                "Регистрация на сайте довольно простая. Есть вариант быстрой регистрации. Чтобы вывести деньги со счета нужно обязательно подтвердить свою личность, выслав фотоскан своих документов. Также каждые три месяца БК вас предупреждает, что пароль устарел и его нужно изменить в целях безопасности.\n" +
                "\n" +
                "Главная\n\n" +
                "Раньше сайт Бетсити был очень простым в использовании и многим не совсем нравился его внешний вид. Однако сейчас компания изменила его дизайн, сделав более современным. Правда, удобства после обновления для бывалых клиентов сайта ухудшились: на главной сразу высвечивается раздел LIVE событий. Чтобы посмотреть линию, нужно найти специальное меню вверху.");
        textView2 = view.findViewById(R.id.betcity_text2);
        textView2.setText("Линия\n\n" +
                "Линия и роспись событий в Бетсити находится на приличном уровне. Коэффициенты неплохие, гораздо выше среднего, иногда можно найти весьма отличные предложения. Эксперты же отмечают, что десятипроцентная маржа при длительной игре существенно повлияет на эффективность вашей игры. LIVE раздел представлен довольно масштабно. Роспись хорошая, коэффициенты в общем неплохие.\n" +
                "\n" +
                "Обзор\n\n" +
                "Помимо классических ставок на сайте присутствует тотализатор на футбол и хоккей, где можно выиграть довольно приличный джек-пот. Есть раздел статистика, но он вполне обычный.");
        textView3 = view.findViewById(R.id.betcity_text3);
        textView3.setText("Мобильная версия\n\n" +
                "Сайт БК Бетсити предлагают вполне удобную мобильную версию. Скачав приложение, вы сможете ставить где и когда вам угодно.\n" +
                "\n" +
                "Вывод и ввод средств\n\n" +
                "Пополнить счет в Бетсити удобно, это несомненно плюс. Компания предлагает очень шырокий выбор вариантов. В частности, пополнение возможно через банковский карты: Visa, Master Card, МИР, APPLE PAY, GOOGLE PAY, SAMSUNG PAY. Также доступны электронные кошельки Qiwi, WebMoney, Яндекс деньги, Кошелек ЦУПИС, КОШЕЛЕК ЭЛЕКСНЕТ, мобильные операторы (Мегафон, Теле2, Билайн, Мегафон), салоны сотовой связи (Евросеть, Связной). Сделать это поможет и Интернет-банкинг: Тинькофф, Почта Банк, Росбанк, Альфа-Банк. Для вывода средств Бетсити предлагает банковские карты Visa, Master Card, МИР, электронные кошельки Qiwi, Кошелек ЦУПИС, Яндекс деньги, а также банковский перевод. Некоторые пользователи говорят, что вывести деньги на конторе непросто, но скажем с личного опыта, что с подобными проблемами не сталкивались.");
        textView4 = view.findViewById(R.id.betcity_text4);
        textView4.setText("Служба поддержки\n\n" +
                "БК Бетсити предлагает обратную связь через электронную почту в зависимости от вопроса вы можете обратиться к разным источникам, а также есть в наличии возможность обращения через ICQ. Со своего опыта скажем, что несмотря на негативные отзывы, служба поддержки работает не очень оперативно, но вопрос решить помогает.");

        btn = view.findViewById(R.id.betcity_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://promote.betcity.ru/lp/?refcode=7749freebet&icm=7749&subid=stavki1&utm_source=7749&utm_campaign=7749freebet"));
                startActivity(browserIntent);
            }
        });
        return view;
    }

}
