/*
 * Localization messages.
 *
 * Created on Dec 15 2013
 */

/*
    Copywrite 2013 Will Winder

    This file is part of Universal Gcode Sender (UGS).

    UGS is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    UGS is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with UGS.  If not, see <http://www.gnu.org/licenses/>.
 */
package cn.shu.myugs.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Larry
 */
public class Localization {
    private static ResourceBundle bundle = null;
    
    public static void initialize(String language, String region) {
        Locale locale = new Locale(language, region);
        bundle = ResourceBundle.getBundle("cn.shu.myugs.i18n.MessagesBundle", locale);
    }
    
    public static String getString(String id) {
        if (bundle == null) {
            //Localization.initialize("en", "US");
            Localization.initialize("zh", "CN");
        }
        
        return bundle.getString(id);
    }
}
