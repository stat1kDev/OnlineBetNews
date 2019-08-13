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


public class Buk16Fragment extends Fragment {


    public Buk16Fragment() {
    }

    TextView textView1;
    Button btn;

    public static Buk16Fragment newInstance() {
        return new Buk16Fragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buk16, container, false);
        getActivity().setTitle("Мелбет");
        textView1 = view.findViewById(R.id.mei_bet_text1);
        textView1.setText("БК Melbet (юридическое название ООО МЕЛОФОН) была основана в Москве в 2012 году. С тех пор компания открыла полсотни пунктов приема ставок на территории РФ, а с декабря 2018 принимает ставки в режиме онлайн в Интернете. Компания входит в Первую СРО.\n" +
                "\n" +
                "Регистрация и верификация\n\n" +
                "Процесс идентификации личности, по сути, не отличается от процедуры других БК, однако имеет одно существенное превосходство. Загрузив цветные фото или сканированные копии документов на странице сайта, идентификацию в ЦУПИС можно пройти путем вызова курьера. Это значительно упрощает вопрос логистики для клиента.\n" +
                "\n" +
                "Платежные системы\n\n" +
                "В то же время явным недостатком Мелбет является вывод средств. Если пополнить игровой счет можно благодаря платежным картам Мир, Visa, Mastercard, а также налом в салонах мобильной связи Связной и Евросеть, то с выводом все плохо. Забрать деньги со счета можно лишь посредством сервиса Единого кошелька (One Wallet). При этом минимальная сумма вывода 1000 рублей, против 100 для пополнения. Из хорошего – отсутствие комиссии за вывод.\n" +
                "\n" +
                "Линия и коэффициенты\n\n" +
                "Линию и коэффициенты Melbet смело отнести к «плюсам» букмекера. Широкий выбор видов спорта, хотя можно ставить также на шоу-бизнес лотереи и другие общественные события. В онлайн можно «висят» большие максимумы.\n" +
                "\n" +
                "Топ-события в популярных видах спорта могут собрать до 1000 вариантов ставки. При этом очень глубокая линия на комбинированные ставки и персональную статистику. Много тоталов. Хотя вместо европейских фор Мелбет предлагает только азиатские.\n" +
                "\n" +
                "Роспись в лайве также не бедная. До 200 выборов на среднестатистический матч. Маржа в среднем 6 процентов. Минимальная сумма ставки составляет у Melbet 50 рублей. Кроме стационарной десктоп-версии БК предлагает мобильную версию сайта. Хотя первый вариант все-таки более доработан и удобен. Мобильных приложений букмекер пока не предлагает. Это тоже, безусловно, минус.\n" +
                "\n" +
                "Служба поддержки\n\n" +
                "Связаться с техподдержкой БК Мелбет можно двумя способами: либо электронная почта, либо телефон. Голосовая связь позволяет решать 95% вопросов, письмо писать стоит лишь в отдельных особенных случаях. Отвечают на вызов в службе поддержки Melbet достаточно быстро, уровень адекватности и реальной помощи от консультантов можно оценить как удовлетворительный.\n" +
                "\n" +
                "БК Melbet (юридическое название ООО МЕЛОФОН) была основана в Москве в 2012 году. С тех пор компания открыла полсотни пунктов приема ставок на территории РФ, а с декабря 2018 принимает ставки в режиме онлайн в Интернете. Компания входит в Первую СРО.\n" +
                "\n" +
                "Регистрация и верификация\n\n" +
                "Процесс идентификации личности, по сути, не отличается от процедуры других БК, однако имеет одно существенное превосходство. Загрузив цветные фото или сканированные копии документов на странице сайта, идентификацию в ЦУПИС можно пройти путем вызова курьера. Это значительно упрощает вопрос логистики для клиента.\n" +
                "\n" +
                "Платежные системы\n\n" +
                "В то же время явным недостатком Мелбет является вывод средств. Если пополнить игровой счет можно благодаря платежным картам Мир, Visa, Mastercard, а также налом в салонах мобильной связи Связной и Евросеть, то с выводом все плохо. Забрать деньги со счета можно лишь посредством сервиса Единого кошелька (One Wallet). При этом минимальная сумма вывода 1000 рублей, против 100 для пополнения. Из хорошего – отсутствие комиссии за вывод.\n" +
                "\n" +
                "Линия и коэффициенты\n\n" +
                "Линию и коэффициенты Melbet смело отнести к «плюсам» букмекера. Широкий выбор видов спорта, хотя можно ставить также на шоу-бизнес лотереи и другие общественные события. В онлайн можно «висят» большие максимумы.\n" +
                "\n" +
                "Топ-события в популярных видах спорта могут собрать до 1000 вариантов ставки. При этом очень глубокая линия на комбинированные ставки и персональную статистику. Много тоталов. Хотя вместо европейских фор Мелбет предлагает только азиатские.\n" +
                "\n" +
                "Роспись в лайве также не бедная. До 200 выборов на среднестатистический матч. Маржа в среднем 6 процентов. Минимальная сумма ставки составляет у Melbet 50 рублей. Кроме стационарной десктоп-версии БК предлагает мобильную версию сайта. Хотя первый вариант все-таки более доработан и удобен. Мобильных приложений букмекер пока не предлагает. Это тоже, безусловно, минус.\n" +
                "\n" +
                "Служба поддержки\n\n" +
                "Связаться с техподдержкой БК Мелбет можно двумя способами: либо электронная почта, либо телефон. Голосовая связь позволяет решать 95% вопросов, письмо писать стоит лишь в отдельных особенных случаях. Отвечают на вызов в службе поддержки Melbet достаточно быстро, уровень адекватности и реальной помощи от консультантов можно оценить как удовлетворительный.");
        btn = view.findViewById(R.id.mei_bet_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://melbet.com/ru/"));
                startActivity(browserIntent);
            }
        });
        return view;
    }

}
