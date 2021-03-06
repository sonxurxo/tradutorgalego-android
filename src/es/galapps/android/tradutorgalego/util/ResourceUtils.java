/*
 * This file is part of TradutorGalego.

 * TradutorGalego is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * TradutorGalego is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with TradutorGalego.  If not, see <http://www.gnu.org/licenses/>.
 */
package es.galapps.android.tradutorgalego.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import es.galapps.android.tradutorgalego.R;

public class ResourceUtils {

	public static String getDrawableName(String language, boolean small) {
		if (language.equals("gl")) {
			return small ? "bandera_small_gl" : "bandera_gl";
		}
		if (language.equals("es")) {
			return small ? "bandera_small_es" : "bandera_es";
		}
		if (language.equals("en")) {
			return small ? "bandera_small_en" : "bandera_en";
		}
		if (language.equals("cat")) {
			return small ? "bandera_small_cat" : "bandera_cat";
		}
		return small ? "bandera_small_fr" : "bandera_fr";
	}

	public static Drawable getDrawable(Context context, String language, boolean small) {
		if (language.equals("gl")) {
			return small ? context.getResources().getDrawable(R.drawable.bandera_small_gl)
					: context.getResources().getDrawable(R.drawable.bandera_gl);
		}
		if (language.equals("es")) {
			return small ? context.getResources().getDrawable(R.drawable.bandera_small_es)
					: context.getResources().getDrawable(R.drawable.bandera_es);
		}
		if (language.equals("en")) {
			return small ? context.getResources().getDrawable(R.drawable.bandera_small_en)
					: context.getResources().getDrawable(R.drawable.bandera_en);
		}
		if (language.equals("cat")) {
			return small ? context.getResources().getDrawable(R.drawable.bandera_small_cat)
					: context.getResources().getDrawable(R.drawable.bandera_cat);
		}
		return small ? context.getResources().getDrawable(R.drawable.bandera_small_fr) : context
				.getResources().getDrawable(R.drawable.bandera_fr);
	}

	public static int getDrawableResourceId(String language, boolean small) {
		if (language.equals("gl")) {
			return small ? R.drawable.bandera_small_gl : R.drawable.bandera_gl;
		}
		if (language.equals("es")) {
			return small ? R.drawable.bandera_small_es : R.drawable.bandera_es;
		}
		if (language.equals("en")) {
			return small ? R.drawable.bandera_small_en : R.drawable.bandera_en;
		}
		if (language.equals("cat")) {
			return small ? R.drawable.bandera_small_cat : R.drawable.bandera_cat;
		}
		return small ? R.drawable.bandera_small_fr : R.drawable.bandera_fr;
	}

	public static String getLanguageName(Context context, String languageCode) {
		if (languageCode.equals("gl")) {
			return context.getString(R.string.gl);
		}
		if (languageCode.equals("es")) {
			return context.getString(R.string.es);
		}
		if (languageCode.equals("en")) {
			return context.getString(R.string.en);
		}
		if (languageCode.equals("cat")) {
			return context.getString(R.string.cat);
		}
		return context.getString(R.string.fr);
	}
}
