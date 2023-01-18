/*
 * Copyright (c) 2012, 2022, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (C) 1991-2016 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in 
 * http://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that
 * (a) this copyright and permission notice appear with all copies 
 * of the Data Files or Software,
 * (b) this copyright and permission notice appear in associated 
 * documentation, and
 * (c) there is clear notice in each modified Data File or in the Software
 * as well as in the documentation associated with the Data File(s) or
 * Software that the data or software has been modified.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.util.resources.cldr.ext;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_mt extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] Europe_Central = new String[] {
               "\u0126in \u010aentrali Ewropew Standard",
               "CET",
               "\u0126in \u010aentrali Ewropew tas-Sajf",
               "CEST",
               "\u0126in \u010aentrali Ewropew",
               "CET",
            };
        final String[] Europe_Eastern = new String[] {
               "",
               "EET",
               "",
               "EEST",
               "",
               "EET",
            };
        final String[] Europe_Western = new String[] {
               "",
               "WET",
               "",
               "WEST",
               "",
               "WET",
            };
        final String[] GMT = new String[] {
               "",
               "GMT",
               "",
               "",
               "",
               "",
            };
        final String[] EMPTY_ZONE = new String[] {
               "",
               "",
               "",
               "",
               "",
               "",
            };
        final Object[][] data = new Object[][] {
            { "Europe/Paris", Europe_Central },
            { "GMT", GMT },
            { "Africa/Casablanca", Europe_Western },
            { "Europe/Bucharest", Europe_Eastern },
            { "UTC", EMPTY_ZONE },
            { "timezone.excity.Europe/San_Marino", "San Marino" },
            { "timezone.excity.America/Phoenix", "Phoenix" },
            { "timezone.excity.America/Antigua", "Antigua" },
            { "timezone.excity.Europe/Ljubljana", "Ljubljana" },
            { "timezone.excity.Asia/Irkutsk", "Irkutsk" },
            { "timezone.excity.Pacific/Marquesas", "Marquesas" },
            { "Africa/Cairo", Europe_Eastern },
            { "timezone.excity.America/Danmarkshavn", "Danmarkshavn" },
            { "timezone.excity.America/Anchorage", "Anchorage" },
            { "Europe/London", GMT },
            { "timezone.excity.Antarctica/Vostok", "Vostok" },
            { "timezone.excity.Europe/Skopje", "Skopje" },
            { "timezone.excity.America/Chihuahua", "Chihuahua" },
            { "Europe/Brussels", Europe_Central },
            { "timezone.excity.Atlantic/Reykjavik", "Reykjavik" },
            { "timezone.excity.Pacific/Fiji", "Fiji" },
            { "timezone.excity.Asia/Kamchatka", "Kamchatka" },
            { "timezone.excity.Europe/Gibraltar", "\u0120ibilt\u00e0" },
            { "Europe/Warsaw", Europe_Central },
            { "timezone.excity.Asia/Yakutsk", "Yakutsk" },
            { "timezone.excity.Africa/Djibouti", "Djibouti" },
            { "Europe/Jersey", GMT },
            { "timezone.excity.Africa/Malabo", "Malabo" },
            { "timezone.excity.America/Recife", "Recife" },
            { "timezone.excity.Pacific/Wallis", "Wallis" },
            { "Europe/Luxembourg", Europe_Central },
            { "timezone.excity.Africa/Porto-Novo", "Porto-Novo" },
            { "timezone.excity.Antarctica/Palmer", "Palmer" },
            { "timezone.excity.Africa/Libreville", "Libreville" },
            { "timezone.excity.Asia/Tashkent", "Tashkent" },
            { "timezone.excity.Antarctica/Rothera", "Rothera" },
            { "Europe/Zaporozhye", Europe_Eastern },
            { "timezone.excity.Africa/Dakar", "Dakar" },
            { "Atlantic/St_Helena", GMT },
            { "timezone.excity.Asia/Shanghai", "Shanghai" },
            { "timezone.excity.Africa/Addis_Ababa", "Addis Ababa" },
            { "timezone.excity.Africa/Kinshasa", "Kinshasa" },
            { "timezone.excity.Asia/Dushanbe", "Dushanbe" },
            { "Europe/Guernsey", GMT },
            { "timezone.excity.America/Juneau", "Juneau" },
            { "timezone.excity.Pacific/Bougainville", "Bougainville" },
            { "timezone.excity.Europe/Tallinn", "Tallinn" },
            { "timezone.excity.Pacific/Apia", "Apia" },
            { "timezone.excity.America/El_Salvador", "El Salvador" },
            { "Europe/Isle_of_Man", GMT },
            { "timezone.excity.Pacific/Guam", "Guam" },
            { "timezone.excity.Europe/Vaduz", "Vaduz" },
            { "Africa/Tunis", Europe_Central },
            { "Africa/Tripoli", Europe_Eastern },
            { "Africa/Banjul", GMT },
            { "timezone.excity.Pacific/Niue", "Niue" },
            { "timezone.excity.Asia/Barnaul", "Barnaul" },
            { "timezone.excity.America/Menominee", "Menominee" },
            { "timezone.excity.Australia/Lord_Howe", "Lord Howe" },
            { "timezone.excity.Africa/Maseru", "Maseru" },
            { "Europe/Kaliningrad", Europe_Eastern },
            { "timezone.excity.Europe/London", "Londra" },
            { "timezone.excity.Asia/Magadan", "Magadan" },
            { "timezone.excity.Pacific/Wake", "Wake" },
            { "timezone.excity.Atlantic/Canary", "Canary" },
            { "timezone.excity.America/Glace_Bay", "Glace Bay" },
            { "timezone.excity.Pacific/Pitcairn", "Pitcairn" },
            { "timezone.excity.Africa/Casablanca", "Casablanca" },
            { "Etc/GMT", GMT },
            { "timezone.excity.Asia/Krasnoyarsk", "Krasnoyarsk" },
            { "timezone.excity.America/Kralendijk", "Kralendijk" },
            { "Africa/Freetown", GMT },
            { "timezone.excity.America/Nome", "Nome" },
            { "Europe/Malta", Europe_Central },
            { "timezone.excity.Asia/Yerevan", "Yerevan" },
            { "timezone.excity.America/Vancouver", "Vancouver" },
            { "timezone.excity.America/Matamoros", "Matamoros" },
            { "timezone.excity.Europe/Kirov", "Kirov" },
            { "timezone.excity.America/Creston", "Creston" },
            { "Europe/Busingen", Europe_Central },
            { "timezone.excity.Asia/Choibalsan", "Choibalsan" },
            { "timezone.excity.Africa/Cairo", "Cairo" },
            { "timezone.excity.America/Inuvik", "Inuvik" },
            { "timezone.excity.Europe/Warsaw", "Varsavja" },
            { "Europe/Skopje", Europe_Central },
            { "Europe/Sarajevo", Europe_Central },
            { "timezone.excity.Asia/Novokuznetsk", "Novokuznetsk" },
            { "timezone.excity.Europe/Berlin", "Berlin" },
            { "timezone.excity.Pacific/Midway", "Midway" },
            { "Europe/Rome", Europe_Central },
            { "timezone.excity.America/Martinique", "Martinique" },
            { "Africa/Algiers", Europe_Central },
            { "Europe/Mariehamn", Europe_Eastern },
            { "Europe/Zurich", Europe_Central },
            { "timezone.excity.Australia/Perth", "Perth" },
            { "Africa/Bamako", GMT },
            { "timezone.excity.Arctic/Longyearbyen", "Longyearbyen" },
            { "timezone.excity.America/Tegucigalpa", "Tegucigalpa" },
            { "Europe/Gibraltar", Europe_Central },
            { "timezone.excity.Africa/Windhoek", "Windhoek" },
            { "Africa/Conakry", GMT },
            { "timezone.excity.Pacific/Majuro", "Majuro" },
            { "timezone.excity.America/Edmonton", "Edmonton" },
            { "timezone.excity.Africa/Sao_Tome", "Sao Tome" },
            { "timezone.excity.America/Dawson", "Dawson" },
            { "timezone.excity.Africa/Abidjan", "Abidjan" },
            { "Europe/Vaduz", Europe_Central },
            { "timezone.excity.Africa/Banjul", "Banjul" },
            { "timezone.excity.Australia/Lindeman", "Lindeman" },
            { "timezone.excity.America/Guadeloupe", "Guadeloupe" },
            { "timezone.excity.America/Miquelon", "Miquelon" },
            { "timezone.excity.Africa/Freetown", "Freetown" },
            { "timezone.excity.Europe/Vatican", "il-belt tal-Vatikan" },
            { "timezone.excity.Asia/Almaty", "Almaty" },
            { "timezone.excity.Asia/Tbilisi", "Tbilisi" },
            { "Europe/Ljubljana", Europe_Central },
            { "timezone.excity.America/Belize", "Belize" },
            { "timezone.excity.Europe/Minsk", "Minsk" },
            { "timezone.excity.Africa/Monrovia", "Monrovia" },
            { "timezone.excity.Africa/Mbabane", "Mbabane" },
            { "Europe/Berlin", Europe_Central },
            { "timezone.excity.Asia/Bangkok", "Bangkok" },
            { "timezone.excity.America/Rainy_River", "Rainy River" },
            { "timezone.excity.Asia/Beirut", "Bejrut" },
            { "Europe/Chisinau", Europe_Eastern },
            { "Europe/Stockholm", Europe_Central },
            { "Europe/Budapest", Europe_Central },
            { "timezone.excity.Asia/Pontianak", "Pontianak" },
            { "timezone.excity.America/Adak", "Adak" },
            { "Europe/Zagreb", Europe_Central },
            { "timezone.excity.America/Toronto", "Toronto" },
            { "Europe/Helsinki", Europe_Eastern },
            { "Asia/Beirut", Europe_Eastern },
            { "timezone.excity.Asia/Baghdad", "Baghdad" },
            { "timezone.excity.America/Montevideo", "Montevideo" },
            { "timezone.excity.Pacific/Johnston", "Johnston" },
            { "timezone.excity.America/Metlakatla", "Metlakatla" },
            { "timezone.excity.Europe/Jersey", "Jersey" },
            { "timezone.excity.America/Pangnirtung", "Pangnirtung" },
            { "timezone.excity.Atlantic/South_Georgia", "il-Georgia tan-Nofsinhar" },
            { "timezone.excity.Africa/Juba", "Juba" },
            { "timezone.excity.America/Panama", "Panama" },
            { "timezone.excity.America/Havana", "Havana" },
            { "timezone.excity.Europe/Madrid", "Madrid" },
            { "timezone.excity.Europe/Simferopol", "Simferopol" },
            { "timezone.excity.America/Detroit", "Detroit" },
            { "timezone.excity.Indian/Kerguelen", "Kerguelen" },
            { "timezone.excity.America/Grenada", "Grenada" },
            { "timezone.excity.Europe/Volgograd", "Volgograd" },
            { "timezone.excity.Asia/Phnom_Penh", "Phnom Penh" },
            { "timezone.excity.Europe/Monaco", "Monaco" },
            { "timezone.excity.Europe/Rome", "Ruma" },
            { "timezone.excity.Asia/Hebron", "Hebron" },
            { "Africa/Ceuta", Europe_Central },
            { "timezone.excity.Antarctica/Mawson", "Mawson" },
            { "timezone.excity.Asia/Karachi", "Karachi" },
            { "timezone.excity.America/Resolute", "Resolute" },
            { "timezone.excity.Africa/Nouakchott", "Nouakchott" },
            { "timezone.excity.Africa/Bamako", "Bamako" },
            { "timezone.excity.Asia/Muscat", "Muscat" },
            { "timezone.excity.Africa/Tripoli", "Tripoli" },
            { "timezone.excity.Pacific/Enderbury", "Enderbury" },
            { "timezone.excity.Asia/Pyongyang", "Pyongyang" },
            { "timezone.excity.Africa/El_Aaiun", "El Aaiun" },
            { "timezone.excity.Australia/Hobart", "Hobart" },
            { "timezone.excity.Europe/Bucharest", "Bucharest" },
            { "timezone.excity.Europe/Athens", "Ateni" },
            { "timezone.excity.Asia/Bishkek", "Bishkek" },
            { "Europe/Sofia", Europe_Eastern },
            { "Africa/Nouakchott", GMT },
            { "timezone.excity.America/Porto_Velho", "Porto Velho" },
            { "Europe/Prague", Europe_Central },
            { "timezone.excity.America/Paramaribo", "Paramaribo" },
            { "timezone.excity.America/Managua", "Managua" },
            { "Antarctica/Troll", GMT },
            { "timezone.excity.America/Ojinaga", "Ojinaga" },
            { "timezone.excity.Europe/Zurich", "Zurich" },
            { "timezone.excity.America/Sao_Paulo", "Sao Paulo" },
            { "timezone.excity.America/Montserrat", "Montserrat" },
            { "timezone.excity.Europe/Copenhagen", "Copenhagen" },
            { "timezone.excity.America/New_York", "New York" },
            { "timezone.excity.Australia/Darwin", "Darwin" },
            { "Asia/Gaza", Europe_Eastern },
            { "timezone.excity.Africa/Accra", "Accra" },
            { "timezone.excity.Etc/Unknown", "Belt Mhux Mag\u0127ruf" },
            { "timezone.excity.Asia/Jerusalem", "\u0120erusalemm" },
            { "Atlantic/Faeroe", Europe_Western },
            { "timezone.excity.America/Thule", "Thule" },
            { "timezone.excity.America/Grand_Turk", "Grand Turk" },
            { "timezone.excity.Asia/Riyadh", "Riyadh" },
            { "Europe/Copenhagen", Europe_Central },
            { "timezone.excity.Africa/Bangui", "Bangui" },
            { "timezone.excity.Africa/Lusaka", "Lusaka" },
            { "Europe/Vienna", Europe_Central },
            { "timezone.excity.America/Winnipeg", "Winnipeg" },
            { "timezone.excity.Antarctica/Macquarie", "Macquarie" },
            { "timezone.excity.Asia/Ust-Nera", "Ust-Nera" },
            { "timezone.excity.Europe/Uzhgorod", "Uzhgorod" },
            { "timezone.excity.Asia/Damascus", "Damasku" },
            { "timezone.excity.America/Dawson_Creek", "Dawson Creek" },
            { "timezone.excity.Pacific/Kosrae", "Kosrae" },
            { "timezone.excity.Asia/Baku", "Baku" },
            { "timezone.excity.Asia/Hovd", "Hovd" },
            { "timezone.excity.Africa/Harare", "Harare" },
            { "Europe/Tirane", Europe_Central },
            { "timezone.excity.America/Blanc-Sablon", "Blanc-Sablon" },
            { "timezone.excity.Africa/Brazzaville", "Brazzaville" },
            { "timezone.excity.Africa/Algiers", "l-Al\u0121ier" },
            { "Europe/Riga", Europe_Eastern },
            { "timezone.excity.Africa/Khartoum", "Khartoum" },
            { "Africa/Abidjan", GMT },
            { "timezone.excity.Asia/Tehran", "Tehran" },
            { "timezone.excity.Pacific/Tahiti", "Tahiti" },
            { "timezone.excity.Asia/Khandyga", "Khandyga" },
            { "timezone.excity.Africa/Dar_es_Salaam", "Dar es Salaam" },
            { "timezone.excity.America/Monterrey", "Monterrey" },
            { "Europe/Amsterdam", Europe_Central },
            { "timezone.excity.America/Rio_Branco", "Rio Branco" },
            { "Africa/Accra", GMT },
            { "timezone.excity.Europe/Ulyanovsk", "Ulyanovsk" },
            { "timezone.excity.Africa/Niamey", "Niamey" },
            { "timezone.excity.Asia/Makassar", "Makassar" },
            { "timezone.excity.Indian/Mayotte", "Mayotte" },
            { "timezone.excity.Asia/Yekaterinburg", "Yekaterinburg" },
            { "timezone.excity.Europe/Sofia", "Sofija" },
            { "Europe/Dublin", GMT },
            { "timezone.excity.Europe/Astrakhan", "Astrakhan" },
            { "timezone.excity.Africa/Conakry", "Conakry" },
            { "timezone.excity.Asia/Jakarta", "Jakarta" },
            { "timezone.excity.America/Yellowknife", "Yellowknife" },
            { "timezone.excity.Europe/Belgrade", "Belgrad" },
            { "timezone.excity.America/Puerto_Rico", "Puerto Rico" },
            { "timezone.excity.America/Denver", "Denver" },
            { "timezone.excity.Pacific/Efate", "Efate" },
            { "timezone.excity.Asia/Gaza", "Gaza" },
            { "timezone.excity.Asia/Aqtobe", "Aqtobe" },
            { "timezone.excity.Africa/Ceuta", "Ceuta" },
            { "Africa/El_Aaiun", Europe_Western },
            { "Africa/Ouagadougou", GMT },
            { "timezone.excity.Pacific/Rarotonga", "Rarotonga" },
            { "timezone.excity.Antarctica/Troll", "Troll" },
            { "timezone.excity.Europe/Luxembourg", "il-Lussemburgu" },
            { "timezone.excity.Asia/Bahrain", "Bahrain" },
            { "timezone.excity.Asia/Hong_Kong", "Hong Kong" },
            { "timezone.excity.Indian/Mahe", "Mahe" },
            { "timezone.excity.America/Port-au-Prince", "Port-au-Prince" },
            { "Europe/San_Marino", Europe_Central },
            { "timezone.excity.Australia/Eucla", "Eucla" },
            { "timezone.excity.America/Mexico_City", "Mexico City" },
            { "timezone.excity.Europe/Isle_of_Man", "Isle of Man" },
            { "timezone.excity.Pacific/Kwajalein", "Kwajalein" },
            { "timezone.excity.America/Curacao", "Curacao" },
            { "timezone.excity.Pacific/Nauru", "Nauru" },
            { "timezone.excity.Europe/Lisbon", "Lisbona" },
            { "timezone.excity.Pacific/Pago_Pago", "Pago Pago" },
            { "timezone.excity.Pacific/Gambier", "Gambier" },
            { "Asia/Damascus", Europe_Eastern },
            { "timezone.excity.America/Boise", "Boise" },
            { "timezone.excity.Europe/Paris", "Pari\u0121i" },
            { "timezone.excity.Europe/Zaporozhye", "Zaporozhye" },
            { "timezone.excity.Europe/Zagreb", "Zagreb" },
            { "ART", Europe_Eastern },
            { "Atlantic/Reykjavik", GMT },
            { "timezone.excity.America/Dominica", "Dominica" },
            { "timezone.excity.America/Swift_Current", "Swift Current" },
            { "timezone.excity.Africa/Kampala", "Kampala" },
            { "timezone.excity.Pacific/Chatham", "Chatham" },
            { "timezone.excity.America/Tortola", "Tortola" },
            { "Atlantic/Madeira", Europe_Western },
            { "timezone.excity.Europe/Budapest", "Budapest" },
            { "timezone.excity.America/Port_of_Spain", "Port of Spain" },
            { "Europe/Uzhgorod", Europe_Eastern },
            { "timezone.excity.Asia/Chita", "Chita" },
            { "timezone.excity.Asia/Colombo", "Colombo" },
            { "timezone.excity.Pacific/Port_Moresby", "Port Moresby" },
            { "timezone.excity.America/Rankin_Inlet", "Rankin Inlet" },
            { "timezone.excity.America/Santarem", "Santarem" },
            { "timezone.excity.Asia/Tomsk", "Tomsk" },
            { "timezone.excity.Europe/Helsinki", "Helsinki" },
            { "timezone.excity.America/Yakutat", "Yakutat" },
            { "Europe/Andorra", Europe_Central },
            { "timezone.excity.Asia/Anadyr", "Anadyr" },
            { "timezone.excity.Asia/Urumqi", "Urumqi" },
            { "timezone.excity.America/Costa_Rica", "Costa Rica" },
            { "timezone.excity.Africa/Lagos", "Lagos" },
            { "timezone.excity.America/Noronha", "Noronha" },
            { "timezone.excity.Africa/Bissau", "Bissau" },
            { "timezone.excity.Asia/Sakhalin", "Sakhalin" },
            { "timezone.excity.America/Nipigon", "Nipigon" },
            { "timezone.excity.Europe/Guernsey", "Guernsey" },
            { "timezone.excity.Europe/Riga", "Riga" },
            { "Europe/Lisbon", Europe_Western },
            { "timezone.excity.Africa/Douala", "Douala" },
            { "Europe/Oslo", Europe_Central },
            { "timezone.excity.Africa/Mogadishu", "Mogadishu" },
            { "timezone.excity.America/Cambridge_Bay", "Cambridge Bay" },
            { "timezone.excity.America/Bahia_Banderas", "Bahia Banderas" },
            { "timezone.excity.Asia/Jayapura", "Jayapura" },
            { "Atlantic/Canary", Europe_Western },
            { "Africa/Lome", GMT },
            { "timezone.excity.Pacific/Guadalcanal", "Guadalcanal" },
            { "timezone.excity.Africa/Blantyre", "Blantyre" },
            { "timezone.excity.Europe/Malta", "Valletta" },
            { "timezone.excity.Australia/Sydney", "Sydney" },
            { "timezone.excity.Asia/Qatar", "Qatar" },
            { "timezone.excity.Africa/Lome", "Lome" },
            { "timezone.excity.America/Nassau", "Nassau" },
            { "timezone.excity.Asia/Kuwait", "il-Belt tal-Kuwajt" },
            { "timezone.excity.America/Sitka", "Sitka" },
            { "timezone.excity.Antarctica/Davis", "Davis" },
            { "timezone.excity.America/Santo_Domingo", "Santo Domingo" },
            { "Europe/Podgorica", Europe_Central },
            { "timezone.excity.Europe/Moscow", "Moska" },
            { "timezone.excity.America/Aruba", "Aruba" },
            { "timezone.excity.Asia/Qyzylorda", "Qyzylorda" },
            { "timezone.excity.Asia/Taipei", "Taipei" },
            { "Europe/Kiev", Europe_Eastern },
            { "Europe/Belfast", GMT },
            { "timezone.excity.Indian/Mauritius", "Mauritius" },
            { "timezone.excity.Asia/Dhaka", "Dhaka" },
            { "timezone.excity.Europe/Mariehamn", "Mariehamn" },
            { "Atlantic/Jan_Mayen", Europe_Central },
            { "timezone.excity.America/Santiago", "Santiago" },
            { "Europe/Vilnius", Europe_Eastern },
            { "timezone.excity.Asia/Oral", "Oral" },
            { "timezone.excity.America/Fort_Nelson", "Fort Nelson" },
            { "timezone.excity.Asia/Manila", "Manila" },
            { "timezone.excity.America/Indianapolis", "Indianapolis" },
            { "Europe/Madrid", Europe_Central },
            { "timezone.excity.Asia/Seoul", "Seoul" },
            { "timezone.excity.Europe/Busingen", "Busingen" },
            { "timezone.excity.Europe/Istanbul", "Istanbul" },
            { "timezone.excity.America/Marigot", "Marigot" },
            { "timezone.excity.Europe/Sarajevo", "Sarajevo" },
            { "America/Danmarkshavn", GMT },
            { "timezone.excity.Africa/Ndjamena", "Ndjamena" },
            { "timezone.excity.Africa/Kigali", "Kigali" },
            { "timezone.excity.Asia/Vladivostok", "Vladivostok" },
            { "timezone.excity.Africa/Lubumbashi", "Lubumbashi" },
            { "timezone.excity.Africa/Tunis", "Tunis" },
            { "timezone.excity.Asia/Ulaanbaatar", "Ulaanbaatar" },
            { "timezone.excity.Asia/Macau", "Macau" },
            { "Africa/Dakar", GMT },
            { "timezone.excity.Antarctica/McMurdo", "McMurdo" },
            { "timezone.excity.Asia/Novosibirsk", "Novosibirsk" },
            { "timezone.excity.Asia/Srednekolymsk", "Srednekolymsk" },
            { "timezone.excity.Africa/Nairobi", "Nairobi" },
            { "Europe/Tallinn", Europe_Eastern },
            { "timezone.excity.Asia/Samarkand", "Samarkand" },
            { "timezone.excity.Pacific/Fakaofo", "Fakaofo" },
            { "timezone.excity.Australia/Adelaide", "Adelaide" },
            { "timezone.excity.Asia/Singapore", "Singapore" },
            { "Europe/Belgrade", Europe_Central },
            { "timezone.excity.Europe/Vienna", "Vjenna" },
            { "Africa/Bissau", GMT },
            { "timezone.excity.America/Cayman", "Cayman" },
            { "timezone.excity.Europe/Bratislava", "Bratislava" },
            { "timezone.excity.America/Barbados", "Barbados" },
            { "timezone.excity.Asia/Nicosia", "Nikosija" },
            { "timezone.excity.Europe/Kiev", "Kiev" },
            { "timezone.excity.Asia/Dili", "Dili" },
            { "timezone.excity.Asia/Omsk", "Omsk" },
            { "timezone.excity.Asia/Tokyo", "Tokyo" },
            { "timezone.excity.Africa/Bujumbura", "Bujumbura" },
            { "timezone.excity.America/Mazatlan", "Mazatlan" },
            { "timezone.excity.Africa/Johannesburg", "Johannesburg" },
            { "timezone.excity.Asia/Brunei", "Brunei" },
            { "Africa/Timbuktu", GMT },
            { "timezone.excity.America/Whitehorse", "Whitehorse" },
            { "timezone.excity.Europe/Dublin", "Dublin" },
            { "timezone.excity.Asia/Kuching", "Kuching" },
            { "timezone.excity.America/Halifax", "Halifax" },
            { "timezone.excity.America/Merida", "Merida" },
            { "timezone.excity.Antarctica/Casey", "Casey" },
            { "timezone.excity.Pacific/Palau", "Palau" },
            { "timezone.excity.Atlantic/Cape_Verde", "Cape Verde" },
            { "timezone.excity.Africa/Maputo", "Maputo" },
            { "timezone.excity.Africa/Luanda", "Luanda" },
            { "timezone.excity.America/Goose_Bay", "Goose Bay" },
            { "timezone.excity.Pacific/Auckland", "Auckland" },
            { "timezone.excity.America/Los_Angeles", "Los Angeles" },
            { "timezone.excity.Pacific/Norfolk", "Norfolk" },
            { "ECT", Europe_Central },
            { "timezone.excity.Atlantic/Azores", "Azores" },
            { "timezone.excity.Asia/Ashgabat", "Ashgabat" },
            { "timezone.excity.Australia/Melbourne", "Melbourne" },
            { "timezone.excity.America/Anguilla", "Anguilla" },
            { "timezone.excity.Pacific/Honolulu", "Honolulu" },
            { "timezone.excity.Pacific/Tongatapu", "Tongatapu" },
            { "timezone.excity.Antarctica/Syowa", "Syowa" },
            { "timezone.excity.America/Jamaica", "il-\u0120amajka" },
            { "timezone.excity.America/Hermosillo", "Hermosillo" },
            { "timezone.excity.Pacific/Funafuti", "Funafuti" },
            { "timezone.excity.Europe/Podgorica", "Podgorica" },
            { "timezone.excity.Indian/Reunion", "Reunion" },
            { "Asia/Nicosia", Europe_Eastern },
            { "timezone.excity.Australia/Brisbane", "Brisbane" },
            { "timezone.excity.Indian/Antananarivo", "Antananarivo" },
            { "timezone.excity.Pacific/Noumea", "Noumea" },
            { "timezone.excity.Asia/Aden", "Aden" },
            { "timezone.excity.Asia/Vientiane", "Vientiane" },
            { "timezone.excity.Europe/Oslo", "Oslo" },
            { "Europe/Bratislava", Europe_Central },
            { "timezone.excity.Indian/Christmas", "Christmas" },
            { "timezone.excity.Atlantic/Stanley", "Stanley" },
            { "timezone.excity.Asia/Aqtau", "Aqtau" },
            { "timezone.excity.Asia/Rangoon", "Rangoon" },
            { "timezone.excity.America/Regina", "Regina" },
            { "timezone.excity.Asia/Thimphu", "Thimphu" },
            { "timezone.excity.Asia/Dubai", "Dubai" },
            { "Arctic/Longyearbyen", Europe_Central },
            { "timezone.excity.Asia/Kuala_Lumpur", "Kuala Lumpur" },
            { "timezone.excity.America/Thunder_Bay", "Thunder Bay" },
            { "Asia/Hebron", Europe_Eastern },
            { "timezone.excity.Africa/Ouagadougou", "Ouagadougou" },
            { "Africa/Monrovia", GMT },
            { "timezone.excity.Africa/Gaborone", "Gaborone" },
            { "timezone.excity.America/Louisville", "Louisville" },
            { "timezone.excity.America/Cancun", "Cancun" },
            { "timezone.excity.Australia/Broken_Hill", "Broken Hill" },
            { "timezone.excity.Europe/Kaliningrad", "Kaliningrad" },
            { "timezone.excity.Pacific/Kiritimati", "Kiritimati" },
            { "timezone.excity.Indian/Chagos", "Chagos" },
            { "timezone.excity.Asia/Kabul", "Kabul" },
            { "timezone.excity.America/Iqaluit", "Iqaluit" },
            { "timezone.excity.Europe/Tirane", "Tirana" },
            { "timezone.excity.Europe/Prague", "Praga" },
            { "timezone.excity.Pacific/Tarawa", "Tarawa" },
            { "timezone.excity.Atlantic/Bermuda", "Bermuda" },
            { "timezone.excity.Pacific/Saipan", "Saipan" },
            { "Europe/Vatican", Europe_Central },
            { "timezone.excity.Indian/Cocos", "Cocos" },
            { "Asia/Amman", Europe_Eastern },
            { "timezone.excity.Australia/Currie", "Currie" },
            { "timezone.excity.Europe/Chisinau", "Chisinau" },
            { "timezone.excity.Asia/Amman", "Amman" },
            { "timezone.excity.America/Moncton", "Moncton" },
            { "timezone.excity.Europe/Brussels", "Brussell" },
            { "timezone.excity.Atlantic/Madeira", "Madeira" },
            { "timezone.excity.Indian/Comoro", "Comoro" },
            { "timezone.excity.America/Guatemala", "il-Gwatemala" },
            { "timezone.excity.Europe/Stockholm", "Stokkolma" },
            { "timezone.excity.Europe/Samara", "Samara" },
            { "Europe/Athens", Europe_Eastern },
            { "timezone.excity.Europe/Vilnius", "Vilnius" },
            { "timezone.excity.America/Tijuana", "Tijuana" },
            { "Europe/Monaco", Europe_Central },
            { "timezone.excity.America/Chicago", "Chicago" },
            { "timezone.excity.Indian/Maldives", "il-Maldivi" },
        };
        return data;
    }
}
