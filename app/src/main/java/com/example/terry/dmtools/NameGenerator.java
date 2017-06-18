package com.example.terry.dmtools;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class NameGenerator {

	public static String generateName(String charName) {
		charName = charName.toLowerCase();
		boolean go = true;

		if (go) {

			if (charName.equals("random")) {
				String races[] = { "duergar", "dark elf", "orc", "ogre",
						 "half ogre", "tiefling", "wood elf",
						"dwarf", "dragonborn", "halfling", "human",
						"gnome", "half elf", "high elf" };
				int randomNum = GeneratorUtilities.randomNum(races.length - 1,
						1);

				charName = races[randomNum];
			}

			if (charName.equals("duergar")) {

				String prefix[] = { "A", "An", "Ar", "Az", "Bal", "Bar", "Baz",
						"Bel", "Bof", "Bol", "Dal", "Dar", "Del", "Dol", "Dor",
						"Duer", "Dur", "Dwo", "El", "Er", "Fal", "Far", "Gar",
						"Gil", "Gim", "Glan", "Glor", "Har", "Hel", "Jar",
						"Kil", "Ma", "Mor", "Nal", "Nor", "Nur", "Ol", "Or",
						"Ov", "Rei", "The", "Tho", "Thr", "Tor", "Ur", "Val",
						"Von", "Wer", "Whur", "Yur" };
				String suffix[] = { "aim", "ain", "ak", "ar", "aric", "ard",
						"auk", "ak", "bere", "bir", "bin", "dak", "dek", "dok",
						"dal", "din", "el", "ent", "erl", "gal", "gan", "gar",
						"gath", "gen", "grim", "gur", "guk", "i", "ik", "ias",
						"ili", "li", "im", "rim", "in", "rin", "ir", "init",
						"kas", "kral", "lond", "o", "ok", "oak", "on", "lon",
						"or", "ror", "oril", "oric", "rak", "ral", "ric",
						"rid", "rim", "ring", "ster", "stili", "sun", "ten",
						"thal", "then", "thic", "thur", "ur", "rur", "urt",
						"ut", "unt", "val", "var", "vili" };

				return prefixSuffix(charName, 1, prefix, suffix);

			} else if (charName.equals("half orc")) {
				String prefix[] = { "B", "Bal", "Bel", "Bof", "Bol", "D",
						"Dal", "Dor", "Dw", "Far", "Fur", "Gim", "Kil", "Mard",
						"Mor", "Nal", "Nor", "Ov", "Thor", "Thr", "Bor", "Ab",
						"Abz", "Abr", "Br", "Bra", "Bar", "Bru", "Brog",
						"Brug", "Do", "Dar", "Gab", "Gub", "Gro", "Grub",
						"Grom", "Guk", "Guz", "Got", "Jak", "Kar", "Kaz", "Ku",
						"Mog", "Mug", "Mag", "Nu", "Naz", "Nag", "Ogg", "Ogr",
						"Quz", "Qa", "Qu", "Rho", "Rhi", "Ro", "Re", "Reg",
						"Rehg", "Sho", "Sha", "Tur", "Turg", "Tor", "Ug",
						"Ugg", "Ur", "Urk", "Var", "Vug", "Vuk", "Xub", "Xor",
						"Zug", "Za", "Zub", "Zo", "Zok" };

				String suffix[] = { "aim", "ain", "ak", "ar", "i", "im", "in",
						"o", "or", "ur", "ana", "ala", "al", "ip", "ia", "ila",
						"ina", "on", "ola", "ona", "mir", "myr", "mur", "a",
						"aa", "bug", "bor", "buk", "dub", "dur", "dok", "gab",
						"gub", "guk", "gok", "gak", "jub", "juk", "jak", "kek",
						"kush", "kak", "kuk", "luk", "lak", "lek", "lok",
						"muk", "mok", "mush", "mak", "nek", "nuk", "nok",
						"nak", "nom", "ok", "og", "pog", "puk", "pak", "quz",
						"qaz", "qoz", "ra", "rek", "rahk", "rah", "rum", "rom",
						"sa", "tok", "tuk", "tak", "tik", "ug", "uh", "um",
						"voz", "var", "vag", "vug", "xug", "xu", "xum", "za",
						"zug", "zaz", "zag", "zy" };

				return prefixSuffix(charName, 1, prefix, suffix);

			} else if (charName.equals("dark elf")) {
				String prefix[] = { "Akor", "Alaun", "Aly", "Ang", "Ardul",
						"Aun", "Bae", "Bal", "Belar", "Briz", "Bur", "Chal",
						"Chess", "Dhaun", "Dil", "Dirz", "Dris", "Eclav",
						"Elvan", "Elv", "Erel", "Ethe", "Faer", "Felyn",
						"Filf", "Gauss", "Ghuan", "Gin", "Grey", "Hael", "Hal",
						"Houn", "Iiv", "Iim", "Illiam", "In", "Ilph", "Irae",
						"Irr", "Iym", "Jan", "Jhael", "Jhul", "Jys", "Lael",
						"Lar", "LiNeer", "Lird", "Lua", "Mal", "May", "Micar",
						"Min", "Mol", "Myr", "Nath", "Ned", "Nhil", "Neer",
						"Null", "Olor", "Pellan", "Phaer", "Phyr", "Qualn",
						"Quar", "Quav", "Qil", "Rauv", "Ril", "Sbat", "Sab",
						"Shi", "Shri", "Shur", "Shynt", "Sin", "Ssap", "Susp",
						"Talab", "Tal", "Triel", "Ulvir", "Umrae", "Vas",
						"Vic", "Vier", "Vlon", "Waer", "Wuyon", "Xull", "Xun",
						"Yas", "Zar", "Zebey", "Zes", "Zilv" };

				String suffix[] = { "a", "ace", "ae", "aer", "afae", "afay",
						"ala", "anna", "arra", "aste", "avin", "ayne", "baste",
						"breena", "bryn", "cice", "cyrl", "da", "dia", "diira",
						"dra", "driira", "dril", "e", "eari", "eyl", "ffyn",
						"fryn", "iara", "ice", "idil", "iira", "inidia",
						"inil", "intra", "isstra", "ithra", "jra", "jss",
						"kacha", "kiira", "lay", "lara", "lin", "lochar",
						"mice", "murss", "na", "nilee", "niss", "nitra",
						"nolu", "olin", "onia", "oyss", "qualyn", "quarra",
						"quiri", "ra", "rae", "raema", "raena", "riia", "ril",
						"riina", "ryna", "ryne", "shalee", "ssysn", "stin",
						"stra", "tana", "thara", "thrae", "tree", "tyrr",
						"ual", "ue", "uit", "une", "uque", "urra", "va",
						"vayas", "vyll", "vyrae", "wae", "wiira", "wyss",
						"xae", "xena", "xyra", "yl", "ylene", "ymma", "ynda",
						"ynrae", "vrae", "yrr", "zyne" };
				return prefixSuffix(charName, 1, prefix, suffix);

			} else if (charName.equals("orc")) {

				String prefix[] = { "Ab", "Abz", "Abr", "Br", "Bra", "Bar",
						"Bru", "Brog", "Brug", "Do", "Dar", "Gab", "Gub",
						"Gro", "Grub", "Grom", "Guk", "Guz", "Got", "Jak",
						"Kar", "Kaz", "Ku", "Mog", "Mug", "Mag", "Nu", "Naz",
						"Nag", "Ogg", "Ogr", "Quz", "Qa", "Qu", "Rho", "Rhi",
						"Ro", "Re", "Reg", "Rehg", "Sho", "Sha", "Tho", "Tur",
						"Turg", "Tor", "Ug", "Ugg", "Ur", "Urk", "Var", "Vug",
						"Vuk", "Xub", "Xor", "Zug", "Za", "Zan", "Zub", "Zo",
						"Zok" };

				String suffix[] = { "a", "aa", "bug", "bor", "buk", "dub",
						"dur", "dok", "gab", "gub", "guk", "gok", "gak", "jub",
						"juk", "jak", "kek", "kush", "kak", "kuk", "kul",
						"luk", "lak", "lek", "lok", "muk", "mok", "mush",
						"mak", "nek", "nuk", "nok", "nak", "nom", "ok", "og",
						"pog", "puk", "pak", "quz", "qaz", "qoz", "ra", "rek",
						"rahk", "rah", "rum", "rom", "sa", "tok", "tuk", "tak",
						"tik", "ug", "uh", "um", "voz", "var", "vag", "ven",
						"vug", "xug", "xu", "xum", "za", "zug", "zaz", "zag",
						"zy" };

				return prefixSuffix(charName, 1, prefix, suffix);
			} else if (charName.equals("ogre")) {

				String prefix[] = { "Ner", "Bur", "Mar", "Gez", "Far", "Ag",
						"Yorg", "Thar", "Mor", "Negg", "Morg", "Theg", "Yuz",
						"Mag", "Kegg", "Vuzz", "Gar", "Razo", "Ser" };

				String suffix[] = { "gabb", "tag", "ark", "gut", "add", "hgot",
						"olg", "obb", "rog", "zolt", "imurt", "teg", "izoll",
						"argl", "urth", "argl", "urarth", "zulg", "iguzh",
						"ult", };

				return prefixSuffix(charName, 1, prefix, suffix);
			} else if (charName.equals("half ogre")) {


				String prefix[] = { "Ner", "Bur", "Mar", "Gez", "Far", "Ag",
						"Yorg", "Thar", "Mor", "Negg", "Morg", "Theg", "Yuz",
						"Mag", "Kegg", "Vuzz", "Gar", "Razo", "Ser","An", "Aran", "Br", "Dal", 
						"Dun", "Ean", "Fal", "Fen", "Lav", "Mark", 
						"B", "Bal", "Bel", "Bof", "Bol", "D",
						"Dal", "Dor", "Dw", "Far", "Fur", "Gim", "Kil", "Mard",
						"Mor", "Nal", "Nor", "Ov", "Sher", "Thor", "Thr", "Bor" };

				String suffix[] = { "gabb", "tag", "ark", "gut", "add", "hgot",
						"olg", "obb", "rog", "zolt", "imurt", "teg", "izoll",
						"argl", "urth", "argl", "urarth", "zulg", "iguzh",
						"ult", "an", "aim", "ain", "ak", "ar", "i", "im",
						"in", "o", "or", "ur", "ana", "ala", "al", "ip", "ia",
						"ila", "ina", "on", "ola", "ona", "man", "mir", "myr",
						"mur", "us", "low", "do", "kon", "len", "ian", "us" };

				return prefixSuffix(charName, 1, prefix, suffix);
			} else if (charName.equals("tiefling")) {
				
				String prefix[] = { "Ank", "Ark", "Armar", "Arch", "Bal", 
						"Cald", "Cen", "Cor", "Dae", "Dama", "Deme", "Dyn",
						"Gra", "Hel", "Kala", "Kaz", "Kzan", "Mae", 
						"Nama", "Pyran", "Sej", "Tar" };
				
				
				
				String suffix[] = { "hus", "adi", "rius", "idius", "moloch",
						"erax", "rum", "ius", "aceus", "edor", "achus", "adrian",
						"imir", "dro", "eus", "azeus", "sis", "ikus" };
				
				
				
				return prefixSuffix(charName, 1, prefix, suffix);
			} else if (charName.equals("wood elf")) {

				String prefix[] = { "Ael", "Aer", "Af", "Ah", "Al", "Am",
						"Ama", "An", "Ang", "Ansr", "Ar", "Ari", "Arn", "Aza",
						"Bael", "Bes", "Cael", "Cal", "Cas", "Cla", "Cor",
						"Cy", "Dae", "Dho", "Dre", "Du", "Eil", "Eir", "El",
						"Er", "Ev", "Fera", "Fi", "Fir", "Fis", "Gael", "Gar",
						"Gil", "Ha", "Hu", "Ia", "Il", "Ja", "Jar", "Ka",
						"Kan", "Ker", "Keth", "Koeh", "Kor", "Ky", "La", "Laf",
						"Lam", "Lue", "Ly", "Mai", "Mal", "Mara", "My", "Na",
						"Nai", "Nim", "Nu", "Ny", "Py", "Raer", "Re", "Ren",
						"Rhy", "Ru", "Rua", "Rum", "Rid", "Sae", "Seh", "Sel",
						"Sha", "She", "Si", "Sim", "Sol", "Sum", "Syl", "Ta",
						"Tahl", "Tha", "Tho", "Ther", "Thro", "Tia", "Tra",
						"Ty", "Uth", "Ver", "Vil", "Von", "Ya", "Za", "Zy" };

				String suffix[] = { "ae", "ael", "aer", "aias", "ah", "aith",
						"al", "ali", "am", "ama", "an", "ana", "ar", "ara",
						"ari", "aro", "as", "ath", "avel", "brar", "dar",
						"deth", "dre", "drim", "dul", "ean", "el", "emar",
						"en", "er", "ess", "evar", "fel", "hal", "har", "hel",
						"ian", "iat", "ik", "il", "im", "in", "ir", "is",
						"ith", "kash", "ki", "lan", "lam", "lar", "las",
						"lian", "lis", "lyn", "mah", "mil", "mus", "nal",
						"nes", "nin", "nis", "on", "or", "oth", "que", "quis",
						"rah", "rad", "rail", "ran", "reth", "ro", "rull",
						"sal", "san", "sar", "sel", "sha", "spar", "tae",
						"tas", "ten", "thal", "thar", "ther", "thi", "thus",
						"ti", "tril", "ual", "uath", "us", "van", "var",
						"vain", "via", "vin", "wyn", "ya", "yr", "yth", "zair" };
				return prefixSuffix(charName, 1, prefix, suffix);
			} else if (charName.equals("dwarf")) {
				String prefix[] = { "A", "An", "Ar", "Az", "Bal", "Bar", "Baz",
						"Bel", "Bof", "Bol", "Dal", "Dar", "Del", "Dol", "Dor",
						"Duer", "Dur", "Dwo", "El", "Er", "Fal", "Far", "Gar",
						"Gil", "Gim", "Glan", "Glor", "Har", "Hel", "Jar",
						"Kil", "Ma", "Mor", "Nal", "Nor", "Nur", "Ol", "Or",
						"Ov", "Rei", "The", "Tho", "Thr", "Tor", "Ur", "Val",
						"Von", "Wer", "Whur", "Yur" };
				String suffix[] = { "aim", "ain", "ak", "ar", "aric", "ard",
						"auk", "ak", "bere", "bir", "bin", "dak", "dek", "dok",
						"dal", "din", "el", "ent", "erl", "gal", "gan", "gar",
						"gath", "gen", "grim", "gur", "guk", "i", "ik", "ias",
						"ili", "li", "im", "rim", "in", "rin", "ir", "init",
						"kas", "kral", "lond", "o", "ok", "oak", "on", "lon",
						"or", "ror", "oril", "oric", "rak", "ral", "ric",
						"rid", "rim", "ring", "ster", "stili", "sun", "ten",
						"thal", "then", "thic", "thur", "ur", "rur", "urt",
						"ut", "unt", "val", "var", "vili" };
				return prefixSuffix(charName, 1, prefix, suffix);
			} else if (charName.equals("dragonborn")) {

				String prefix[] = { "Ar", "Bala", "Bha", "Dona", "Gh", "Hes",
						"Sar", "Medr", "Nad", "Rheq", "Rheg", "Sham", "She", 
						"Sav", "Vanta", "Raz", "In", "Krey", "Tama"};
				
				
				String suffix[] = { "aan", "jhan", "sar", "rash", "ar", "esh", "ez",
						"az", "ax", "ram", "axis", "zan", "jan", "gyr",
						"ash", "gar", "gez", "gaz", "inn"};
				return prefixSuffix(charName, 1, prefix, suffix);
			} else if (charName.equals("halfling")) {

				String prefix[] = { "Mun", "Kal", "Dem", "Har", "Gor", "Doc",
						"Pip", "Per", "Lan", "By", "Bol", "Mer", "Fro", "Din",
						"Lo", "Will", "Mar", "Rom", "Bran", "Be", "Ber", "Tin" };

				String suffix[] = { "emo", "nard", "ar", "rin", "ren", "mi",
						"di", "ever", "ing", "do", "dod", "der", "ilda", "ral",
						"bo", "ino", "gra", "sum", "sum", "tom", "mas", "fast",
						"co" };
				return prefixSuffix(charName, 1, prefix, suffix);
			} else if (charName.equals("human")) {
				String prefix[] = { "An", "Aran", "Br", "Dal", 
						"Dun", "Ean", "Fal", "Fen", "Lav", "Mark", 
						"B", "Bal", "Bel", "Bof", "Bol", "D",
						"Dal", "Dor", "Dw", "Far", "Fur", "Gim", "Kil", "Mard",
						"Mor", "Nal", "Nor", "Ov", "Sher", "Thor", "Thr", "Bor" };

				String suffix[] = { "an", "aim", "ain", "ak", "ar", "i", "im",
						"in", "o", "or", "ur", "ana", "ala", "al", "ip", "ia",
						"ila", "ina", "on", "ola", "ona", "man", "mir", "myr",
						"mur", "us", "low", "do", "kon", "len", "ian", "us" };
				return prefixSuffix(charName, 1, prefix, suffix);
			} else if (charName.equals("gnome")) {

				String prefix[] = { "Nobb", "Svim", "Relib", "Dol", "Svil",
						"Brem", "Svob", "Grim", "Tik", "Tiki", "Dom", "Grith",
						"Bir" };

				String suffix[] = { "firn", "blone", "blor", "foln", "dri",
						"line", "rir", "rele" };

				return prefixSuffix(charName, 1, prefix, suffix);
			} else if (charName.equals("half elf")) {
				String prefix[] = { "B", "Bal", "Bel", "Bof", "Bol", "D",
						"Dal", "Dor", "Dw", "Far", "Fur", "Gim", "Kil", "Mard",
						"Mor", "Nal", "Nor", "Ov", "Thor", "Thr", "Bor", "Am",
						"Ama", "An", "Ang", "Ansr", "Ar", "Ari", "Arn", "Aza",
						"Bael", "Bes", "Cael", "Cal", "Cas", "Cla", "Cor",
						"Cy", "Dae", "Dho", "Dre", "Du", "Eil", "Eir", "El",
						"Er", "Ev", "Fera", "Fi", "Fir", "Fis", "Gael", "Gar",
						"Gil", "Ha", "Hu", "Ia", "Il", "Ja", "Jar", "Ka",
						"Kan", "Ker", "Keth", "Koeh", "Kor", "Ky", "La", "Laf",
						"Lam", "Lue", "Ly", "Mai", "Mal", "Mara", "My", "Na",
						"Nai", "Nim", "Nu", "Ny", "Py", "Raer", "Re", "Ren",
						"Rhy", "Ru", "Rua", "Rum", "Rid", "Sae", "Seh", "Sel",
						"Sha", "She", "Si", "Sim", "Sol", "Sum", "Syl", "Ta",
						"Tahl", "Tha", "Tho", "Ther", "Thro", "Tia", "Tra",
						"Ty", "Uth", "Ver", "Vil", "Von", "Ya", "Za", "Zy" };

				String suffix[] = { "aim", "ain", "ak", "ar", "i", "im", "in",
						"o", "or", "ur", "ana", "ala", "al", "ip", "ia", "ila",
						"ina", "on", "ola", "ona", "mir", "myr", "mur", "ae",
						"ael", "aer", "aias", "ah", "aith", "al", "ali", "am",
						"ama", "an", "ana", "ar", "ara", "ari", "aro", "as",
						"ath", "avel", "brar", "dar", "deth", "dre", "drim",
						"dul", "ean", "el", "emar", "en", "er", "ess", "evar",
						"fel", "hal", "har", "hel", "ian", "iat", "ik", "il",
						"im", "in", "ir", "is", "ith", "kash", "ki", "lan",
						"lam", "lar", "las", "lian", "lis", "lyn", "mah",
						"mil", "mus", "nal", "nes", "nin", "nis", "on", "or",
						"oth", "que", "quis", "rah", "rad", "rail", "ran",
						"reth", "ro", "rull", "sal", "san", "sar", "sel",
						"sha", "spar", "tae", "tas", "ten", "thal", "thar",
						"ther", "thi", "thus", "ti", "tril", "ual", "uath",
						"us", "van", "var", "vain", "via", "vin", "wyn", "ya",
						"yr", "yth", "zair" };

				return prefixSuffix(charName, 1, prefix, suffix);
			} else if (charName.equals("high elf")) {

				String prefix[] = { "Ael", "Aer", "Af", "Ah", "Al", "Am",
						"Ama", "An", "Ang", "Ansr", "Ar", "Ari", "Arn", "Aza",
						"Bael", "Bes", "Cael", "Cal", "Cas", "Cla", "Cor",
						"Cy", "Dae", "Dho", "Dre", "Du", "Eil", "Eir", "El",
						"Er", "Ev", "Fera", "Fi", "Fir", "Fis", "Gael", "Gar",
						"Gil", "Ha", "Hu", "Ia", "Il", "Ja", "Jar", "Ka",
						"Kan", "Ker", "Keth", "Koeh", "Kor", "Ky", "La", "Laf",
						"Lam", "Lue", "Ly", "Mai", "Mal", "Mara", "My", "Na",
						"Nai", "Nim", "Nu", "Ny", "Py", "Raer", "Re", "Ren",
						"Rhy", "Ru", "Rua", "Rum", "Rid", "Sae", "Seh", "Sel",
						"Sha", "She", "Si", "Sim", "Sol", "Sum", "Syl", "Ta",
						"Tahl", "Tha", "Tho", "Ther", "Thro", "Tia", "Tra",
						"Ty", "Uth", "Ver", "Vil", "Von", "Ya", "Za", "Zy" };

				String suffix[] = { "ae", "ael", "aer", "aias", "ah", "aith",
						"al", "ali", "am", "ama", "an", "ana", "ar", "ara",
						"ari", "aro", "as", "ath", "avel", "brar", "dar",
						"deth", "dre", "drim", "dul", "ean", "el", "emar",
						"en", "er", "ess", "evar", "fel", "hal", "har", "hel",
						"ian", "iat", "ik", "il", "im", "in", "ir", "is",
						"ith", "kash", "ki", "lan", "lam", "lar", "las",
						"lian", "lis", "lyn", "mah", "mil", "mus", "nal",
						"nes", "nin", "nis", "on", "or", "oth", "que", "quis",
						"rah", "rad", "rail", "ran", "reth", "ro", "rull",
						"sal", "san", "sar", "sel", "sha", "spar", "tae",
						"tas", "ten", "thal", "thar", "ther", "thi", "thus",
						"ti", "tril", "ual", "uath", "us", "van", "var",
						"vain", "via", "vin", "wyn", "ya", "yr", "yth", "zair" };
				return prefixSuffix(charName, 1, prefix, suffix);
			}

			return null;

		}
		return charName;
	}

	private static String prefixSuffix(String charRace, int desiredNumber, String[] prefix,
			String[] suffix) {
		String name;
		String prefixName;
		String suffixName;

		int x = (int) Math.ceil(Math.random() * (prefix.length)) - 1;

		prefixName = prefix[x];

		int y = (int) Math.ceil(Math.random() * (suffix.length)) - 1;

		suffixName = suffix[y];
		name = prefixName + suffixName;

		return name;
	}

}
