package tech.zerofiltre.testing.calcul.service;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.inject.Named;

@Named
public class SolutionFormatterImpl implements SolutionFormatter {

	@Override
	public String format(int solution) {
		DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(Locale.FRENCH);
		symbols.setGroupingSeparator(' ');
		return new DecimalFormat("#,##0", symbols).format(solution);
	}
}
