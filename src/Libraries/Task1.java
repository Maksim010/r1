package Libraries;

import com.github.moneytostr.MoneyToStr;
import org.efaps.number2words.Converter;
import org.efaps.number2words.IConverter;

import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        IConverter converter = Converter.getMaleConverter(Locale.ENGLISH);
        String text = converter.convert(2000);
        System.out.println(text);

        MoneyToStr moneyToStr = new MoneyToStr(MoneyToStr.Currency.USD, MoneyToStr.Language.RUS, MoneyToStr.Pennies.NUMBER);
        System.out.println(moneyToStr.convert(777.77D));
    }
}

