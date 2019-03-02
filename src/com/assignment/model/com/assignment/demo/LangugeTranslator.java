package com.assignment.model.com.assignment.demo;

import com.assignment.model.Language;

public class LangugeTranslator {

    public String translate(Language translateTo) {

        switch (translateTo) {
           case Danish:
               return "kykyliky";
            case Dutch:
                return "kukeleku";
            case Finnish:
                return "kukko kiekuu";
            case French:
                 return "cocorico";
            case German:
                return "kikeriki";
            case Greek:
                return "kikiriki";
            case Hebrew:
                return "coo-koo-ri-koo";
            case Hungarian:
                return "kukuriku";
            case Italian:
                return "chicchirichi";
            case Japanese:
                return "ko-ke-kok-ko-o";
            case Portuguese:
                return "cucurucu";
            case Russian:
                return "kukareku";
            case Swedish:
                return "kuckeliku";
            case Turkish:
                return "kuk-kurri-kuuu";
            case Urdu:
                return "kuklooku";
            default:
                return "Cock-a-doodle-doo";
        }
    }

}
