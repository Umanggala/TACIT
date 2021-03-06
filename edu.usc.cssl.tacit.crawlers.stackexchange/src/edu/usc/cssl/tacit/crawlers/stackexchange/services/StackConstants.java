package edu.usc.cssl.tacit.crawlers.stackexchange.services;

import java.util.HashMap;
import java.util.Map;

public class StackConstants {
	public static final Map<String, String> domainList = new HashMap<String, String>();
	
	//list of all the domains available
	public static String sortTypes[] = {"STACK_OVERFLOW","SERVER_FAULT","SUPER_USER","META_STACK_OVERFLOW",
			"WEB_APPLICATIONS","WEB_APPLICATIONS_META","ARQADE","ARQADE_META","WEBMASTERS","WEBMASTERS_META",
			"SEASONED_ADVICE","SEASONED_ADVICE_META","GAME_DEVELOPMENT","GAME_DEVELOPMENT_META","PHOTOGRAPHY",
			"PHOTOGRAPHY_META","CROSS_VALIDATED","CROSS_VALIDATED_META","MATHEMATICS","MATHEMATICS_META",
			"HOME_IMPROVEMENT","HOME_IMPROVEMENT_META","META_SUPER_USER","META_SERVER_FAULT",
			"GEOGRAPHIC_INFORMATION_SYSTEMS","GEOGRAPHIC_INFORMATION_SYSTEMS_META","TEX_LATEX","TEX_LATEX_META",
			"ASK_UBUNTU","ASK_UBUNTU_META","PERSONAL_FINANCE_MONEY","PERSONAL_FINANCE_MONEY_META",
			"ENGLISH_LANGUAGE_USAGE","ENGLISH_LANGUAGE_USAGE_META","STACK_APPS","USER_EXPERIENCE",
			"USER_EXPERIENCE_META","UNIX_LINUX","UNIX_LINUX_META","WORDPRESS_DEVELOPMENT",
			"WORDPRESS_DEVELOPMENT_META","THEORETICAL_COMPUTER_SCIENCE","THEORETICAL_COMPUTER_SCIENCE_META",
			"ASK_DIFFERENT","ASK_DIFFERENT_META","ROLE_PLAYING_GAMES","ROLE_PLAYING_GAMES_META","BICYCLES",
			"BICYCLES_META","PROGRAMMERS","PROGRAMMERS_META","ELECTRICAL_ENGINEERING",
			"ELECTRICAL_ENGINEERING_META","ANDROID_ENTHUSIASTS","ANDROID_ENTHUSIASTS_META","BOARD_CARD_GAMES",
			"BOARD_CARD_GAMES_META","PHYSICS","PHYSICS_META","HOMEBREWING","HOMEBREWING_META",
			"INFORMATION_SECURITY","INFORMATION_SECURITY_META","WRITERS","WRITERS_META","VIDEO_PRODUCTION",
			"VIDEO_PRODUCTION_META","GRAPHIC_DESIGN","GRAPHIC_DESIGN_META","DATABASE_ADMINISTRATORS",
			"DATABASE_ADMINISTRATORS_META","SCIENCE_FICTION_FANTASY","SCIENCE_FICTION_FANTASY_META",
			"CODE_REVIEW","CODE_REVIEW_META","PROGRAMMING_PUZZLES_CODE_GOLF","PROGRAMMING_PUZZLES_CODE_GOLF_META",
			"QUANTITATIVE_FINANCE","QUANTITATIVE_FINANCE_META","PROJECT_MANAGEMENT","PROJECT_MANAGEMENT_META",
			"SKEPTICS","SKEPTICS_META","PHYSICAL_FITNESS","PHYSICAL_FITNESS_META","DRUPAL_ANSWERS",
			"DRUPAL_ANSWERS_META","MOTOR_VEHICLE_MAINTENANCE_REPAIR","MOTOR_VEHICLE_MAINTENANCE_REPAIR_META",
			"PARENTING","PARENTING_META","SHAREPOINT","SHAREPOINT_META","MUSICAL_PRACTICE_PERFORMANCE",
			"MUSICAL_PRACTICE_PERFORMANCE_META","SOFTWARE_QUALITY_ASSURANCE_TESTING",
			"SOFTWARE_QUALITY_ASSURANCE_TESTING_META","MI_YODEYA","MI_YODEYA_META","GERMAN_LANGUAGE",
			"GERMAN_LANGUAGE_META","JAPANESE_LANGUAGE","JAPANESE_LANGUAGE_META","PHILOSOPHY","PHILOSOPHY_META",
			"GARDENING_LANDSCAPING","GARDENING_LANDSCAPING_META","TRAVEL","TRAVEL_META","PERSONAL_PRODUCTIVITY",
			"PERSONAL_PRODUCTIVITY_META","CRYPTOGRAPHY","CRYPTOGRAPHY_META","SIGNAL_PROCESSING",
			"SIGNAL_PROCESSING_META","FRENCH_LANGUAGE","FRENCH_LANGUAGE_META","CHRISTIANITY",
			"CHRISTIANITY_META","BITCOIN","BITCOIN_META","LINGUISTICS","LINGUISTICS_META",
			"BIBLICAL_HERMENEUTICS","BIBLICAL_HERMENEUTICS_META","HISTORY","HISTORY_META","LEGO_ANSWERS",
			"LEGO_ANSWERS_META","SPANISH_LANGUAGE","SPANISH_LANGUAGE_META","COMPUTATIONAL_SCIENCE",
			"COMPUTATIONAL_SCIENCE_META","MOVIES_TV","MOVIES_TV_META","CHINESE_LANGUAGE",
			"CHINESE_LANGUAGE_META","BIOLOGY","BIOLOGY_META","POKER","POKER_META","MATHEMATICA",
			"MATHEMATICA_META","COGNITIVE_SCIENCES","COGNITIVE_SCIENCES_META","THE_GREAT_OUTDOORS",
			"THE_GREAT_OUTDOORS_META","MARTIAL_ARTS","MARTIAL_ARTS_META","SPORTS","SPORTS_META","ACADEMIA",
			"ACADEMIA_META","COMPUTER_SCIENCE","COMPUTER_SCIENCE_META","THE_WORKPLACE","THE_WORKPLACE_META",
			"WINDOWS_PHONE","WINDOWS_PHONE_META","CHEMISTRY","CHEMISTRY_META","CHESS","CHESS_META",
			"RASPBERRY_PI","RASPBERRY_PI_META","RUSSIAN_LANGUAGE","RUSSIAN_LANGUAGE_META","ISLAM",
			"ISLAM_META","SALESFORCE","SALESFORCE_META","ASK_PATENTS","ASK_PATENTS_META",
			"GENEALOGY_FAMILY_HISTORY","GENEALOGY_FAMILY_HISTORY_META","ROBOTICS","ROBOTICS_META",
			"EXPRESSIONENGINE_ANSWERS","EXPRESSIONENGINE_ANSWERS_META","POLITICS","POLITICS_META",
			"ANIME_MANGA","ANIME_MANGA_META","MAGENTO","MAGENTO_META","ENGLISH_LANGUAGE_LEARNERS",
			"ENGLISH_LANGUAGE_LEARNERS_META","SUSTAINABLE_LIVING","SUSTAINABLE_LIVING_META","TRIDION",
			"TRIDION_META","REVERSE_ENGINEERING","REVERSE_ENGINEERING_META","NETWORK_ENGINEERING",
			"NETWORK_ENGINEERING_META","OPEN_DATA","OPEN_DATA_META","FREELANCING","FREELANCING_META",
			"BLENDER","BLENDER_META","MATHOVERFLOW","MATHOVERFLOW_META","SPACE_EXPLORATION",
			"SPACE_EXPLORATION_META","SOUND_DESIGN","SOUND_DESIGN_META","ASTRONOMY","ASTRONOMY_META",
			"TOR","TOR_META","PETS","PETS_META","AMATEUR_RADIO","AMATEUR_RADIO_META","ITALIAN_LANGUAGE",
			"ITALIAN_LANGUAGE_META","STACK_OVERFLOW_EM_PORTUGUES","STACK_OVERFLOW_EM_PORTUGUES_META","AVIATION",
			"AVIATION_META","EBOOKS","EBOOKS_META","BEER","BEER_META","SOFTWARE_RECOMMENDATIONS",
			"SOFTWARE_RECOMMENDATIONS_META","ARDUINO","ARDUINO_META","EXPATRIATES","EXPATRIATES_META",
			"MATHEMATICS_EDUCATORS","MATHEMATICS_EDUCATORS_META" };
	
	//map of domain and their url parameter
	static {
		domainList.put("STACK_OVERFLOW","stackoverflow");
		domainList.put("SERVER_FAULT","serverfault");
		domainList.put("SUPER_USER","superuser");
		domainList.put("META_STACK_OVERFLOW","meta.stackoverflow");
		domainList.put("WEB_APPLICATIONS","webapps");
		domainList.put("WEB_APPLICATIONS_META","meta.webapps");
		domainList.put("ARQADE","gaming");
		domainList.put("ARQADE_META","meta.gaming");
		domainList.put("WEBMASTERS","webmasters");
		domainList.put("WEBMASTERS_META","meta.webmasters");
		domainList.put("SEASONED_ADVICE","cooking");
		domainList.put("SEASONED_ADVICE_META","meta.cooking");
		domainList.put("GAME_DEVELOPMENT","gamedev");
		domainList.put("GAME_DEVELOPMENT_META","meta.gamedev");
		domainList.put("PHOTOGRAPHY","photo");
		domainList.put("PHOTOGRAPHY_META","meta.photo");
		domainList.put("CROSS_VALIDATED","stats");
		domainList.put("CROSS_VALIDATED_META","meta.stats");
		domainList.put("MATHEMATICS","math");
		domainList.put("MATHEMATICS_META","meta.math");
		domainList.put("HOME_IMPROVEMENT","diy");
		domainList.put("HOME_IMPROVEMENT_META","meta.diy");
		domainList.put("META_SUPER_USER","meta.superuser");
		domainList.put("META_SERVER_FAULT","meta.serverfault");
		domainList.put("GEOGRAPHIC_INFORMATION_SYSTEMS","gis");
		domainList.put("GEOGRAPHIC_INFORMATION_SYSTEMS_META","meta.gis");
		domainList.put("TEX_LATEX","tex");
		domainList.put("TEX_LATEX_META","meta.tex");
		domainList.put("ASK_UBUNTU","askubuntu");
		domainList.put("ASK_UBUNTU_META","meta.askubuntu");
		domainList.put("PERSONAL_FINANCE_MONEY","money");
		domainList.put("PERSONAL_FINANCE_MONEY_META","meta.money");
		domainList.put("ENGLISH_LANGUAGE_USAGE","english");
		domainList.put("ENGLISH_LANGUAGE_USAGE_META","meta.english");
		domainList.put("STACK_APPS","stackapps");
		domainList.put("USER_EXPERIENCE","ux");
		domainList.put("USER_EXPERIENCE_META","meta.ux");
		domainList.put("UNIX_LINUX","unix");
		domainList.put("UNIX_LINUX_META","meta.unix");
		domainList.put("WORDPRESS_DEVELOPMENT","wordpress");
		domainList.put("WORDPRESS_DEVELOPMENT_META","meta.wordpress");
		domainList.put("THEORETICAL_COMPUTER_SCIENCE","cstheory");
		domainList.put("THEORETICAL_COMPUTER_SCIENCE_META","meta.cstheory");
		domainList.put("ASK_DIFFERENT","apple");
		domainList.put("ASK_DIFFERENT_META","meta.apple");
		domainList.put("ROLE_PLAYING_GAMES","rpg");
		domainList.put("ROLE_PLAYING_GAMES_META","meta.rpg");
		domainList.put("BICYCLES","bicycles");
		domainList.put("BICYCLES_META","meta.bicycles");
		domainList.put("PROGRAMMERS","programmers");
		domainList.put("PROGRAMMERS_META","meta.programmers");
		domainList.put("ELECTRICAL_ENGINEERING","electronics");
		domainList.put("ELECTRICAL_ENGINEERING_META","meta.electronics");
		domainList.put("ANDROID_ENTHUSIASTS","android");
		domainList.put("ANDROID_ENTHUSIASTS_META","meta.android");
		domainList.put("BOARD_CARD_GAMES","boardgames");
		domainList.put("BOARD_CARD_GAMES_META","meta.boardgames");
		domainList.put("PHYSICS","physics");
		domainList.put("PHYSICS_META","meta.physics");
		domainList.put("HOMEBREWING","homebrew");
		domainList.put("HOMEBREWING_META","meta.homebrew");
		domainList.put("INFORMATION_SECURITY","security");
		domainList.put("INFORMATION_SECURITY_META","meta.security");
		domainList.put("WRITERS","writers");
		domainList.put("WRITERS_META","meta.writers");
		domainList.put("VIDEO_PRODUCTION","video");
		domainList.put("VIDEO_PRODUCTION_META","meta.video");
		domainList.put("GRAPHIC_DESIGN","graphicdesign");
		domainList.put("GRAPHIC_DESIGN_META","meta.graphicdesign");
		domainList.put("DATABASE_ADMINISTRATORS","dba");
		domainList.put("DATABASE_ADMINISTRATORS_META","meta.dba");
		domainList.put("SCIENCE_FICTION_FANTASY","scifi");
		domainList.put("SCIENCE_FICTION_FANTASY_META","meta.scifi");
		domainList.put("CODE_REVIEW","codereview");
		domainList.put("CODE_REVIEW_META","meta.codereview");
		domainList.put("PROGRAMMING_PUZZLES_CODE_GOLF","codegolf");
		domainList.put("PROGRAMMING_PUZZLES_CODE_GOLF_META","meta.codegolf");
		domainList.put("QUANTITATIVE_FINANCE","quant");
		domainList.put("QUANTITATIVE_FINANCE_META","meta.quant");
		domainList.put("PROJECT_MANAGEMENT","pm");
		domainList.put("PROJECT_MANAGEMENT_META","meta.pm");
		domainList.put("SKEPTICS","skeptics");
		domainList.put("SKEPTICS_META","meta.skeptics");
		domainList.put("PHYSICAL_FITNESS","fitness");
		domainList.put("PHYSICAL_FITNESS_META","meta.fitness");
		domainList.put("DRUPAL_ANSWERS","drupal");
		domainList.put("DRUPAL_ANSWERS_META","meta.drupal");
		domainList.put("MOTOR_VEHICLE_MAINTENANCE_REPAIR","mechanics");
		domainList.put("MOTOR_VEHICLE_MAINTENANCE_REPAIR_META","meta.mechanics");
		domainList.put("PARENTING","parenting");
		domainList.put("PARENTING_META","meta.parenting");
		domainList.put("SHAREPOINT","sharepoint");
		domainList.put("SHAREPOINT_META","meta.sharepoint");
		domainList.put("MUSICAL_PRACTICE_PERFORMANCE","music");
		domainList.put("MUSICAL_PRACTICE_PERFORMANCE_META","meta.music");
		domainList.put("SOFTWARE_QUALITY_ASSURANCE_TESTING","sqa");
		domainList.put("SOFTWARE_QUALITY_ASSURANCE_TESTING_META","meta.sqa");
		domainList.put("MI_YODEYA","judaism");
		domainList.put("MI_YODEYA_META","meta.judaism");
		domainList.put("GERMAN_LANGUAGE","german");
		domainList.put("GERMAN_LANGUAGE_META","meta.german");
		domainList.put("JAPANESE_LANGUAGE","japanese");
		domainList.put("JAPANESE_LANGUAGE_META","meta.japanese");
		domainList.put("PHILOSOPHY","philosophy");
		domainList.put("PHILOSOPHY_META","meta.philosophy");
		domainList.put("GARDENING_LANDSCAPING","gardening");
		domainList.put("GARDENING_LANDSCAPING_META","meta.gardening");
		domainList.put("TRAVEL","travel");
		domainList.put("TRAVEL_META","meta.travel");
		domainList.put("PERSONAL_PRODUCTIVITY","productivity");
		domainList.put("PERSONAL_PRODUCTIVITY_META","meta.productivity");
		domainList.put("CRYPTOGRAPHY","crypto");
		domainList.put("CRYPTOGRAPHY_META","meta.crypto");
		domainList.put("SIGNAL_PROCESSING","dsp");
		domainList.put("SIGNAL_PROCESSING_META","meta.dsp");
		domainList.put("FRENCH_LANGUAGE","french");
		domainList.put("FRENCH_LANGUAGE_META","meta.french");
		domainList.put("CHRISTIANITY","christianity");
		domainList.put("CHRISTIANITY_META","meta.christianity");
		domainList.put("BITCOIN","bitcoin");
		domainList.put("BITCOIN_META","meta.bitcoin");
		domainList.put("LINGUISTICS","linguistics");
		domainList.put("LINGUISTICS_META","meta.linguistics");
		domainList.put("BIBLICAL_HERMENEUTICS","hermeneutics");
		domainList.put("BIBLICAL_HERMENEUTICS_META","meta.hermeneutics");
		domainList.put("HISTORY","history");
		domainList.put("HISTORY_META","meta.history");
		domainList.put("LEGO_ANSWERS","bricks");
		domainList.put("LEGO_ANSWERS_META","meta.bricks");
		domainList.put("SPANISH_LANGUAGE","spanish");
		domainList.put("SPANISH_LANGUAGE_META","meta.spanish");
		domainList.put("COMPUTATIONAL_SCIENCE","scicomp");
		domainList.put("COMPUTATIONAL_SCIENCE_META","meta.scicomp");
		domainList.put("MOVIES_TV","movies");
		domainList.put("MOVIES_TV_META","meta.movies");
		domainList.put("CHINESE_LANGUAGE","chinese");
		domainList.put("CHINESE_LANGUAGE_META","meta.chinese");
		domainList.put("BIOLOGY","biology");
		domainList.put("BIOLOGY_META","meta.biology");
		domainList.put("POKER","poker");
		domainList.put("POKER_META","meta.poker");
		domainList.put("MATHEMATICA","mathematica");
		domainList.put("MATHEMATICA_META","meta.mathematica");
		domainList.put("COGNITIVE_SCIENCES","cogsci");
		domainList.put("COGNITIVE_SCIENCES_META","meta.cogsci");
		domainList.put("THE_GREAT_OUTDOORS","outdoors");
		domainList.put("THE_GREAT_OUTDOORS_META","meta.outdoors");
		domainList.put("MARTIAL_ARTS","martialarts");
		domainList.put("MARTIAL_ARTS_META","meta.martialarts");
		domainList.put("SPORTS","sports");
		domainList.put("SPORTS_META","meta.sports");
		domainList.put("ACADEMIA","academia");
		domainList.put("ACADEMIA_META","meta.academia");
		domainList.put("COMPUTER_SCIENCE","cs");
		domainList.put("COMPUTER_SCIENCE_META","meta.cs");
		domainList.put("THE_WORKPLACE","workplace");
		domainList.put("THE_WORKPLACE_META","meta.workplace");
		domainList.put("WINDOWS_PHONE","windowsphone");
		domainList.put("WINDOWS_PHONE_META","meta.windowsphone");
		domainList.put("CHEMISTRY","chemistry");
		domainList.put("CHEMISTRY_META","meta.chemistry");
		domainList.put("CHESS","chess");
		domainList.put("CHESS_META","meta.chess");
		domainList.put("RASPBERRY_PI","raspberrypi");
		domainList.put("RASPBERRY_PI_META","meta.raspberrypi");
		domainList.put("RUSSIAN_LANGUAGE","russian");
		domainList.put("RUSSIAN_LANGUAGE_META","meta.russian");
		domainList.put("ISLAM","islam");
		domainList.put("ISLAM_META","meta.islam");
		domainList.put("SALESFORCE","salesforce");
		domainList.put("SALESFORCE_META","meta.salesforce");
		domainList.put("ASK_PATENTS","patents");
		domainList.put("ASK_PATENTS_META","meta.patents");
		domainList.put("GENEALOGY_FAMILY_HISTORY","genealogy");
		domainList.put("GENEALOGY_FAMILY_HISTORY_META","meta.genealogy");
		domainList.put("ROBOTICS","robotics");
		domainList.put("ROBOTICS_META","meta.robotics");
		domainList.put("EXPRESSIONENGINE_ANSWERS","expressionengine");
		domainList.put("EXPRESSIONENGINE_ANSWERS_META","meta.expressionengine");
		domainList.put("POLITICS","politics");
		domainList.put("POLITICS_META","meta.politics");
		domainList.put("ANIME_MANGA","anime");
		domainList.put("ANIME_MANGA_META","meta.anime");
		domainList.put("MAGENTO","magento");
		domainList.put("MAGENTO_META","meta.magento");
		domainList.put("ENGLISH_LANGUAGE_LEARNERS","ell");
		domainList.put("ENGLISH_LANGUAGE_LEARNERS_META","meta.ell");
		domainList.put("SUSTAINABLE_LIVING","sustainability");
		domainList.put("SUSTAINABLE_LIVING_META","meta.sustainability");
		domainList.put("TRIDION","tridion");
		domainList.put("TRIDION_META","meta.tridion");
		domainList.put("REVERSE_ENGINEERING","reverseengineering");
		domainList.put("REVERSE_ENGINEERING_META","meta.reverseengineering");
		domainList.put("NETWORK_ENGINEERING","networkengineering");
		domainList.put("NETWORK_ENGINEERING_META","meta.networkengineering");
		domainList.put("OPEN_DATA","opendata");
		domainList.put("OPEN_DATA_META","meta.opendata");
		domainList.put("FREELANCING","freelancing");
		domainList.put("FREELANCING_META","meta.freelancing");
		domainList.put("BLENDER","blender");
		domainList.put("BLENDER_META","meta.blender");
		domainList.put("MATHOVERFLOW","mathoverflow.net");
		domainList.put("MATHOVERFLOW_META","meta.mathoverflow.net");
		domainList.put("SPACE_EXPLORATION","space");
		domainList.put("SPACE_EXPLORATION_META","meta.space");
		domainList.put("SOUND_DESIGN","sound");
		domainList.put("SOUND_DESIGN_META","meta.sound");
		domainList.put("ASTRONOMY","astronomy");
		domainList.put("ASTRONOMY_META","meta.astronomy");
		domainList.put("TOR","tor");
		domainList.put("TOR_META","meta.tor");
		domainList.put("PETS","pets");
		domainList.put("PETS_META","meta.pets");
		domainList.put("AMATEUR_RADIO","ham");
		domainList.put("AMATEUR_RADIO_META","meta.ham");
		domainList.put("ITALIAN_LANGUAGE","italian");
		domainList.put("ITALIAN_LANGUAGE_META","meta.italian");
		domainList.put("STACK_OVERFLOW_EM_PORTUGUES","pt.stackoverflow");
		domainList.put("STACK_OVERFLOW_EM_PORTUGUES_META","meta.pt.stackoverflow");
		domainList.put("AVIATION","aviation");
		domainList.put("AVIATION_META","meta.aviation");
		domainList.put("EBOOKS","ebooks");
		domainList.put("EBOOKS_META","meta.ebooks");
		domainList.put("BEER","beer");
		domainList.put("BEER_META","meta.beer");
		domainList.put("SOFTWARE_RECOMMENDATIONS","softwarerecs");
		domainList.put("SOFTWARE_RECOMMENDATIONS_META","meta.softwarerecs");
		domainList.put("ARDUINO","arduino");
		domainList.put("ARDUINO_META","meta.arduino");
		domainList.put("EXPATRIATES","expatriates");
		domainList.put("EXPATRIATES_META","meta.expatriates");
		domainList.put("MATHEMATICS_EDUCATORS","matheducators");
		domainList.put("MATHEMATICS_EDUCATORS_META","meta.matheducators");
	}

}
