package ar.com.santihollmann.binaryconverter;

import android.text.Editable;

/**
 * Created by santiago on 17/05/13.
 */
public class NumberConverter {

    public String convertDecimalToBinary(Editable numberInEditable) {

        int decimalNumber = convertEditableToDecimal(numberInEditable);
        return Integer.toBinaryString(decimalNumber);
    }


    private int convertEditableToDecimal(Editable numberInEditable) {
        String stringOfEditable = numberInEditable.toString();
        int decimalNumber;

        if (stringOfEditable.isEmpty()) {
            decimalNumber = 0;
        } else {
            decimalNumber = Integer.valueOf(stringOfEditable);
        }

        return decimalNumber;
    }

}
