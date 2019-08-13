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

public class Buk18Fragment extends Fragment {


    public Buk18Fragment() {
    }

    TextView textView1;
    Button btn;

    public static Buk18Fragment newInstance() {
        return new Buk18Fragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buk18, container, false);
        getActivity().setTitle("Greenbet");
        textView1 = view.findViewById(R.id.green_bet_text1);
        textView1.setText("Greenbet от юридического лица Drive Media Entertainment N.V. была основана в 2010 году. Контора входит в перечень легальных на территории РФ. У компании большой охват наземных пунктов приема ставок. В России их уже около 350, все адреса указаны на сайте.\n" +
                "\n" +
                "Регистрация\n\n" +
                "Зарегистрироваться на сайте можно воспользовавшись формой, это займет у Вас минуту. Нужно просто ввести свои личные данные и подтвердить их, после этого Вам присваивается кошелек с личным номером, который можно сразу пополнить.\n" +
                "\n" +
                "Линия\n\n" +
                "   - Мышиные, собачьи, лошадиные и тараканьи бега;\n" +
                "   - Онлайн-казино;\n" +
                "   - Виртуальный спорт;\n" +
                "   - Пари на киберспорт;\n" +
                "   - Карты;\n" +
                "   - Кено;\n" +
                "   - Бинго.\n" +
                "Ставок на спортивные состязания в конторе нет.\n" +
                "\n" +
                "Ввод и вывод средств\n\n" +
                "Пополнить счет можно с помощью платёжных систем VISA/MasterCard, Qiwi, Яндекс Деньги. Также депозит можно совершить благодаря операторам сотовой связи Beeline, Мегафон, МТС и Tele2. Минимальная сумма депозита составляет 20 рублей, минимальная ставка составляет 1 рубль.\n" +
                "\n" +
                "Вывести деньги можно с помощью платёжных систем VISA/MasterCard, Qiwi и Яндекс Деньги. Также вывод можно совершить благодаря операторам сотовой связи Beeline, Мегафон, МТС и Tele2. Минимальная сумма вывода равна 100 рублям. Максимальная сумма вывода 66 667 рублей, при комиссии 10%.\n" +
                "\n" +
                "Бонусы\n\n" +
                "Компания предлагает обозначенный бонус в 250 фрибетов за идентификацию на сайте. Первоначально бесплатная ставка появляется на бонусном счете игрока. Далее, используя их, можно сделать ставку. В случае выигрыша, доход от неё минус 250 фрибетов будет добавлен уже на игровой счет.\n" +
                "\n" +
                "Служба поддержки\n\n" +
                "Служба поддержки доступна все 24 часа.\n" +
                "\n" +
                "Обратиться с вопросом можно несколькими способами\n" +
                "\n" +
                "   - Телефон 8-800-555-31-35, звонок бесплатный\n" +
                "   - E-mail : support@greenbet.ru\n" +
                "   - Skype: support@greenbet.ru\n");
        btn = view.findViewById(R.id.green_bet_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://winline.ru/freebet1000?btag=a_996b_267c_"));
                startActivity(browserIntent);
            }
        });
        return view;
    }

}
