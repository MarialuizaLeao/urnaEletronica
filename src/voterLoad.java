package main;

public class voterLoad {
  public static String load = """
      123456789012,Engenharia de Software II Tester,MG
      268888719264,Madeline Deckow,MG
      816681036428,Dwayne Maggio,MT
      819149753955,Mr. Jay Turcotte,MT
      243918739409,Cathy McGlynn,RS
      137561241086,Molly Kerluke,MT
      277253538900,Janie Feest I,RN
      407813062736,Tony Wiegand,TO
      536342400428,Ronald Altenwerth,SP
      841261422596,Maureen Price DVM,PB
      681857572535,Sonja Pfeffer,RS
      363312468601,Bill Luettgen DVM,MS
      493321202109,Jacob Howe,AL
      426165751863,Frances Marquardt,AP
      691638222751,Johnnie Greenfelder,PI
      245655614279,Lloyd Ruecker Sr.,MS
      368791134453,Lola Hyatt,DF
      532026295873,Ellen Sanford PhD,ES
      164063063843,Bonnie Terry,PE
      524365901406,Allan Williamson IV,BA
      644182591494,Leland Schamberger,CE
      542520238829,Harry Pollich,AC
      814751936262,Grace Nitzsche,RS
      124977254341,Ms. Wayne Ryan,AL
      410466340935,Mr. Rosalie Terry,SE
      875731797898,Roderick Skiles,SP
      680954266358,Naomi McClure,CE
      495231817835,Leticia Von PhD,SP
      533904549898,Ana Donnelly,RR
      794157285193,Robin Mitchell IV,PA
      101268829099,Mr. Todd Hackett PhD,DF
      559601788958,Shelia Runolfsson,RJ
      262802405338,Emmett Windler Sr.,AL
      355432794375,Sergio Hahn,PA
      736988546515,Virgil Schoen Jr.,SE
      681597947712,Roger Schultz III,SP
      941156598688,Clifton Blanda,BA
      957425319260,Billy Beier,ES
      165154134392,Ms. Salvatore West,PI
      349144463908,Elaine Lemke,RR
      233065504065,Jodi Gulgowski,PE
      418155766411,Ricardo Weber,MA
      779027052796,Bertha Kohler,AC
      623332889846,Randall Cronin DDS,TO
      945441327261,Rosalie Nienow,PE
      741997066378,Crystal Harvey,RN
      509425160795,Miss Michael Lubowitz,RJ
      582754745633,Miss Nina Gleason,MT
      553052086249,Ms. Lewis Wunsch,PI
      533191605022,Shannon Hodkiewicz,AP
      130300235704,Wade Russel,MS
      249390494565,Lauren Lowe,TO
      766054221971,Rodolfo Adams,RO
      260676987006,Lynette Harris,SC
      490590725907,Mrs. Morris Stehr,CE
      271883608550,Frank Goyette,AC
      582740421260,Bobbie Breitenberg,TO
      757576312320,Miss Ronald Carroll,PE
      990371736929,Chad Mitchell I,PI
      681650375552,Eugene Gutmann MD,GO
      713473179370,Roman Brakus,BA
      931048824293,Kristina Kuhn II,SE
      399275237265,Mrs. David Nikolaus,AM
      456320684876,Kristen Cremin,RS
      257023251237,Ms. Vickie Bergnaum,RN
      756644668472,Marjorie Braun,PA
      964517373206,Margarita Dibbert,CE
      583939600700,Darin King,MG
      118052269235,Irene Leannon,AP
      836364167164,Bob Baumbach,SP
      400820993820,Minnie Kessler,PE
      273326187602,Mark Ward PhD,RO
      540747273217,Lori Hills,RN
      898309953370,Jan Gusikowski,MT
      425830335657,Ramon Kautzer,PE
      171248536881,Stanley Pouros,AL
      108536460764,Maryann Cormier,MA
      310029350129,Judy Jakubowski,RN
      638991919941,Arnold Rau,MG
      693165393655,Nina Mosciski,GO
      472527275892,Ignacio Rau,GO
      101298391109,Warren Franecki,AC
      986132930630,Ronald Ondricka,GO
      665213678629,Merle D'Amore,MT
      243766220196,Deborah Connelly V,RN
      204269057690,Rosie Blick,MA
      439134420628,Louise Lowe,PA
      190024401840,Mrs. Ben Dibbert,MA
      285468007643,Nichole Botsford,RO
      773302854371,Jeanne Kuhlman,AP
      279843216269,Kelly Schiller,RO
      543318755517,Dorothy Moore,MT
      626917826846,Alex Raynor,PB
      796109102531,Leona DuBuque,RS
      573300538242,Reginald Lebsack DDS,RJ
      965575671024,Henrietta Kihn,MG
      210739609585,Donnie Legros,GO
      580408781474,Bob Adams DVM,TO
      693246400841,Elena Greenholt II,SP
      900260884662,Miranda Lakin,MA
      402680176618,Irving Altenwerth,AP
      123984643474,Orlando Ritchie,ES
      803615512782,Ashley Larson,GO
      289822460348,Geneva Schowalter,RO
      182488503155,Mrs. Iris Buckridge Sr.,BA
      689250436591,Sean Lind,MA
      399723872530,Amy Hills,RN
      679697597953,Kelli Schowalter,MA
      313555217002,Neal Hills II,MG
      428332929577,Mr. Paula Luettgen,TO
      116539123190,Shirley Mosciski,RR
      644534185416,Laura Wilderman PhD,CE
      242226529078,Cecilia Bins,DF
      567621602104,Dr. Myron Weimann,PA
      452809294065,Karen Deckow,DF
      529238406379,Randolph Emard,BA
      232184198193,Louis Haag,PE
      699507318946,Myron Anderson,AM
      358557280233,Brittany Will,RR
      121602668555,Dr. Marcos Armstrong,RJ
      737435550760,Mathew Renner,AL
      950338607326,Sheri Haley,RN
      888156924619,Ms. Sarah Treutel,SE
      367926434664,Lillie Wilkinson,MS
      856978834058,Al Balistreri,PB
      783263792060,Pam Boyer,PR
      849672776085,Anita Breitenberg,MG
      888618043196,Luz Rice,MG
      493811320792,Miss Margaret Langworth,AL
      292007681274,Ernestine Murphy,RJ
      999910510403,Daniel Dietrich,SP
      100806519193,Jackie Schoen,AM
      312403741037,Vicki Ward,GO
      835133511354,Florence Glover,ES
      234948351722,Nathaniel Thiel,RJ
      351412847129,Oliver Larkin,AC
      841773371748,Israel Reynolds,PB
      154516192314,Nora Rohan,RN
      639935786922,Carol Hermiston,RO
      556963250851,Cynthia Fahey,BA
      611958535659,Eddie Lakin,RR
      815205621682,Rosa Kohler,MG
      463136712480,Jeff Hoeger,PI
      738647293953,Frankie Witting,ES
      434516556691,Levi Wisozk,PE
      101926234475,Alexandra Jaskolski,PI
      670002773406,Belinda Simonis,GO
      438694352951,Rafael Hartmann,TO
      456872057305,Michelle Kuhlman,PI
      429631228490,Lillian Spinka,RS
      859892909643,Ervin Dooley,AC
      205636135384,Alonzo Bode,AL
      752008915634,Wilbur Reynolds DDS,MT
      325787259792,Billie Steuber,PI
      668686146988,Maryann Simonis,MS
      180985876425,Angie Kiehn,RR
      227896488477,Darlene Swaniawski,SC
      538246250836,Estelle Kirlin,MS
      545169740237,Oscar Smith,RJ
      755765459142,Tommie VonRueden,TO
      662434089394,Celia Rodriguez,PB
      891866244772,Lowell DuBuque,AC
      966803441090,Abraham Kuhlman,PI
      278447276533,Sheldon Lemke,PI
      861998698084,Dr. Ada Pacocha,GO
      421561632601,Julia Schamberger,ES
      392615669676,Juan Weimann MD,AC
      575188063554,Marty Pagac,AP
      711117095869,Lillie Bayer,RJ
      278547508231,Tomas Koelpin,SC
      580249781094,Eric Stark,DF
      353516095087,Dana Bernhard,SP
      259408872757,Hattie Stehr,AP
      138189747924,Wilbert Gerhold,MG
      965356421885,Elaine Ledner,MG
      665283809140,Pamela Olson,MG
      460264228236,Ron Rosenbaum,RN
      667122817030,Mr. Damon Schowalter,PI
      894898610317,Lorraine Blanda,MS
      248420332335,Antoinette Huels,CE
      896263277890,Lucille Rosenbaum,BA
      473593611951,Krista Emmerich,TO
      445130143001,Miss Leslie Glover,PI
      229161514003,Tyrone Tillman,CE
      288258315530,Devin Becker,PE
      552790739452,Elijah Hickle,PA
      974778915008,Alonzo Zemlak,CE
      387716451836,Dr. Emilio Sipes,MT
      128051177339,Miss Kim Fay,SP
      908153774274,May Ziemann,MG
      872206513191,Kristi Torphy,PA
      267222869968,Ruth Lehner,RJ
      279190590946,Rene Mitchell DVM,SP
      683307281769,Angela McCullough,MS
      531451186792,Lula Miller,PR
      430859015688,Guadalupe Ratke,RO
      218550423520,Shelly Stehr,AM
      476778865669,Hazel Von,MG
      184027909079,Bob Bashirian,PI
      934048032131,Edmund Boyer,AL
      906227102662,Andres Ondricka II,ES
      364475368665,Jana Thompson,MS
      314805733619,Karen Hilpert,PB
      528050539602,Pat Bailey,MS
      425133229277,Nick Cole IV,MG
      279709283803,Kim Waelchi,AL
      210913794509,Lela Hilpert DDS,RO
      756352374433,Marianne Doyle,DF
      774726952462,Miguel Fisher,SC
      425796145466,Dr. Blake Ratke,MG
      235686367696,Kristen Abbott,PB
      239643639845,Laurie Howe DVM,SE
      832588338285,Paula Hoeger,RJ
      574072214522,Edgar Klocko,AP
      859715490056,Bernard King,SE
      610628434719,Christian Jenkins,SP
      630969777452,Miss Max Osinski DVM,SC
      878743572124,Jordan Torp,BA
      135132725182,Dr. Willis Koss,BA
      215422644757,Tracy Koss,RO
      962105839867,Marlene Walker,MA
      762469177422,Marc Koss,PE
      757113759626,Angel Kemmer,ES
      306766717381,Kimberly Von,GO
      561128950722,Penny Pacocha,PA
      139446760187,Paulette Dicki,CE
      902692380750,Clifton Dach,PA
      717085450261,Jeremy Jacobi,TO
      301661340859,Delbert Hilll MD,CE
      114504455654,Alberta Quigley,PR
      829678408174,Laverne Lockman,PB
      866603019467,Sonja Cronin,AC
      900927131078,Christy Ward,RS
      724073039984,Dwayne Schmidt,PR
      612937457993,Mae Boehm,SC
      574118610360,Mrs. Madeline Lindgren,RJ
      664799085769,Jeffery O'Reilly,PB
      276469257745,Wesley Kuvalis,RJ
      154354934985,Jesse Zemlak,RS
      732014487763,Dr. Shane Kunde,AL
      345130952369,Yolanda Goldner,PI
      759000250952,Homer Brakus,MA
      421431610331,Derrick Luettgen,MG
      706930358783,Joshua Towne,MG
      180484339755,Victor Ebert,MA
      102756521343,Marguerite Heller,PI
      223599349101,Fredrick MacGyver,RN
      566758097525,Sammy Douglas,SP
      217000331526,Gary Smitham,MS
      637406673647,Jenna Streich,MT
      263653381322,Kelly Turner,DF
      801085408033,Sarah Schumm,SE
      197377896447,Louis Kessler,MS
      722927888051,Aubrey Wiegand,RJ
      967759194332,Beverly Ziemann IV,BA
      296007836368,Leon Fisher,RO
      753635341608,Jo Little,MA
      978051639848,Neal Homenick,ES
      191631831294,Miss Zachary West,PE
      127026761507,Catherine Pacocha,PB
      595602930201,Kathryn Hilll,MT
      930289435546,Gayle Kirlin,BA
      481144440287,Abraham O'Connell,RJ
      754544712616,Darryl Lindgren,AM
      324259711458,Jo Beier,ES
      443140209617,Clint Kessler I,SP
      610086706968,Russell Wilkinson,RS
      487930422749,Roosevelt Lind,AP
      685782850955,Ella Veum,SP
      882848470297,Ms. Catherine Thompson,SP
      731473464915,Mrs. Santiago O'Keefe,RN
      625839224537,Laurie Jacobson,PR
      234615785446,Franklin Will,PA
      268207520567,Shannon O'Keefe,AM
      355813205040,Judy Ortiz V,RS
      266527839313,Howard Osinski,TO
      845142884588,Veronica Marvin Jr.,AP
      781680601719,Yvette McCullough,MT
      802883190415,Simon Howe,MG
      526827025449,Craig Friesen,MT
      441678311035,Agnes Hauck I,GO
      609978207894,Taylor Zemlak III,PI
      136945858131,Brendan Dach,SC
      624643609521,Barry Koch,PI
      641208438982,Vincent Rutherford,GO
      170287745837,Arlene Farrell,DF
      961278031225,Emilio Crona,RN
      695285384002,Ervin Cronin,PA
      119495476988,Al Yundt,RJ
      455726738527,Brent Sanford,MG
      210731229326,Jesus Runolfsdottir,RO
      452534560632,Roberta Beer,MG
      609322709558,Fred Marvin V,AC
      426064764331,James Kunde,AC
      707778156708,Miss Yvonne Beahan,RR
      579718598374,Steven Kreiger III,MS
      239614932280,Oliver Rowe,AC
      169159883833,Mrs. Sally Denesik,PA
      607521049311,Ann Ryan,RN
      208350673366,Beatrice Bode,MS
      484132234601,Ms. Sheila Becker,CE
      665186192931,Dan Rempel,MA
      471721637996,Cassandra Leannon,BA
      410294900535,Mr. Sara Kemmer,RJ
      350566335352,Mrs. Oliver Greenfelder PhD,AM
      982395791577,Rosie Jaskolski Jr.,SC
      312696723162,Leah Lubowitz,AP
      998104565023,Jennifer Rempel,AP
      876963461695,Dr. Joann Jaskolski,CE
      394573924514,Flora Farrell,MT
      471685291736,Lori Waters II,SP
      442063228128,Antoinette Sawayn,RS
      577717523684,Stacy Bauch,MS
      310762546623,Dixie Keebler,AC
      370505376564,Daniel Oberbrunner,MT
      600342227591,Timmy O'Keefe,MT
      141869510421,Edmond Block,AC
      830695292763,Terence Jacobi,SC
      771493273886,Mrs. Sonia Tremblay,SE
      566291381900,Angel Satterfield,TO
      398626737894,Darrin Oberbrunner,SE
      247741072127,Ms. Nichole Toy PhD,TO
      332412660168,Silvia Kiehn,BA
      284096485444,Lela Breitenberg,MT
      194758099271,Lowell Boyle,SP
      582488395175,Ms. Nicholas Koss,PI
      531166961609,Jamie Trantow,AP
      993863161091,Henry Ebert,PE
      558272065799,Monica Kuphal,TO
      483089241354,Michelle Jakubowski,DF
      485645877809,Joshua Steuber,BA
      402116498066,Duane Donnelly,ES
      243474035497,Sophia Schroeder DVM,RO
      291906486267,Lucille Collier,SC
      211825455121,Marsha Shanahan,ES
      160040406503,Miss Gilbert Kessler,RR
      845426956985,Bennie Lowe,PE
      158684952003,Erica Ziemann,SP
      477857536418,Mario Feest,AL
      367680468399,Darren Schultz,RR
      364461316259,Elena Ebert,PE
      140769565087,Eduardo Zemlak,AM
      945353184589,Paulette Berge,AP
      174165382600,Miriam Larkin,MA
      179809853456,Alan Hyatt,ES
      685732852721,Alberto Little,RS
      766309115433,Carolyn Bartell,RS
      232447402963,Emilio McKenzie,PB
      328687502048,Mrs. Phil Jenkins DDS,RJ
      352720953726,Darlene Kulas,ES
      455368152995,Edna Leffler,PB
      332973331316,Troy Hansen,MG
      302015173268,Wendell Abernathy,BA
      779465236554,Loren Crist,DF
      951882719201,Jessica Homenick,PB
      859665524296,Eleanor Windler I,PR
      373908550359,Cameron Zemlak,TO
      692825072798,Armando Sauer,AP
      369896351962,Lionel Kuphal MD,PR
      570608998523,Mr. Chad Reichel,AL
      856276361808,Blanche Abbott,CE
      980314743077,Yolanda Klein,MG
      814116913956,Jeanne Keeling,PE
      427960626486,Jeanette Collier,PB
      734979633018,Peter Feil DVM,PE
      251205539924,Roman Schiller,DF
      252745878127,Mr. Isaac Tillman,RO
      873726568344,Lance Kunze Jr.,RJ
      734542956503,Fredrick Moore,CE
      285934531511,David Zboncak,RR
      691524146925,Rodney Yundt,RS
      996401287588,Pablo Schulist II,PE
      140710199517,Claudia Zemlak,RO
      122531045772,Charlotte Bartoletti,PR
      695082965159,Becky Wolff,ES
      120557992831,Mike Considine,AM
      894238975577,Roman Friesen,MG
      385823925024,Michael Terry,RR
      734603845135,Ethel Nitzsche,RO
      836247913648,Alicia Hudson,MA
      957597455397,Mrs. Henry Haag,SC
      567479806958,Tony Considine,RR
      216571561710,Abraham Gorczany,PE
      919169719224,Shelia Ebert,MG
      339071711965,Josephine Hermiston,AM
      922950913492,Ernest Aufderhar,AM
      665527700373,Jermaine McCullough,GO
      766257572109,Gregg Corwin,AP
      108967668290,Mr. Willis Orn,PB
      767500039034,Tricia Ortiz,PE
      790932307657,Michael Jones,CE
      703294794343,Billy Littel,MT
      114215782103,Billy Schmidt,PR
      959953756708,Harvey Bins,SE
      445620983529,Neal Weber,MS
      984782050442,Constance Denesik,AL
      324944827337,Jo Mayert,RS
      532380021067,Dwayne Becker,AM
      348291710638,Oscar Wyman Jr.,BA
      893646081696,Lillie Ferry V,DF
      964095755877,Sidney Ebert,PE
      154881743777,Laurie Kemmer,RO
      205707870491,Gerardo Thiel,PR
      777481044940,Joshua Johnson,MA
      118844642015,Gretchen Deckow,MG
      569963908650,Pat Pollich,AM
      176518729910,Rudy Kub,PE
      192657701054,Eddie Prohaska IV,SE
      731109072310,Alexandra Schmidt,CE
      966503188265,Miss Vernon Konopelski,PB
      815383800093,Jasmine Emmerich,MA
      294340482682,Sonja Veum,AM
      743812986462,Emma Kozey,MT
      247657575220,Miss Caleb Gulgowski,CE
      731676349127,Shaun Beahan,MG
      785150519740,Terry Luettgen,ES
      790959533317,Dale Schumm,GO
      822610975823,Dora Conroy,BA
      370798884779,Wanda Stoltenberg,SC
      527029197713,Mr. Terence Marquardt I,PE
      362141466984,Ian Dickens III,RN
      469306821301,Dean Ratke Jr.,DF
      782374964188,Jim Abshire,DF
      582563638316,Janice Koch,TO
      783006956056,Jean Rutherford,PI
      288031590095,Jan O'Reilly V,PI
      907429921894,Jacquelyn MacGyver,ES
      994935915374,Gary Kuhn,SP
      227823682489,Julian Koelpin,AC
      779663527187,Dr. Elaine Stiedemann III,MT
      225662871863,Ruby Schulist,AM
      484904719681,Mack Grant,BA
      659156638678,Jessica Marquardt,BA
      642974681255,Josefina Bruen,PI
      377549041761,Jacqueline Lockman,ES
      497052412026,Melinda Jacobs,CE
      456790427455,Elias King,GO
      867521685712,Kara Kirlin,ES
      709231379920,Rochelle Stanton,SC
      683015810545,Santiago Towne,PE
      825395828695,Lawrence Kiehn,TO
      593611052810,Gretchen Kulas,GO
      357030741313,Jo Dooley,AC
      890771434447,Brian Ernser,AL
      987106805790,Dr. Marianne Kutch,BA
      281517271996,Shawna Cummings,DF
      122380417154,Genevieve Grady,SE
      267395021992,Mrs. Candace Gorczany,PR
      364870002941,Ella Boyer,MG
      760695107304,Jan Bradtke,MS
      560202925437,Mrs. Nathan Littel MD,CE
      561956964513,Miranda Abshire,RO
      458808790988,Lyle Mayert,PE
      655062493924,Luke Schmidt,SE
      349029219736,Faye Farrell,RS
      549948896548,Steven Schowalter,RN
      634222431756,Keith Kub,GO
      768671697717,Amy Purdy,CE
      330717381560,Geneva Flatley V,RR
      920111190288,Wanda Ritchie,PI
      540728703973,Freddie Lakin,PB
      675592170093,Derek Sawayn,TO
      254655069064,David Medhurst,RJ
      348717274798,Madeline Conn,MS
      650400701382,Rex VonRueden,RJ
      530085357670,Mrs. Velma Daugherty,GO
      944032751490,Cindy Reichel,PA
      924607136997,Julio Wiegand,CE
      205295363205,Samuel Hegmann,PA
      636229035632,Lynn Hagenes DDS,PI
      866477788482,Andrea Stark,ES
      485015326411,Keith Bins,AC
      521668126657,Ms. Kari Walker,PE
      892507555282,Mona Brakus,MG
      990208200107,Herman Walter,RS
      728125736714,Ms. Edna Gerlach Jr.,MA
      798723373289,Antoinette Hessel,RS
      252193438141,Pam Marvin,PE
      353648872944,Wm Spencer,PI
      240690363244,Ms. Willard Carter III,BA
      695692376749,Stanley Breitenberg,PR
      552048562471,Max Reynolds,PA
      559184186272,Scott Crona,PA
      476122361726,Jaime Spinka,MS
      311296048413,Lorenzo Lehner,CE
      552336723644,Brenda Jast,ES
      103564448587,Antonio Schimmel,MG
      788944784432,Charlotte Considine PhD,PI
      269467947653,Shane Denesik,RN
      747375777506,Javier Kessler,PI
      166843147879,Dr. Loren Hansen,RS
      517868051135,Raul Metz,TO
      669207859063,Benjamin Streich,SC
      642600970312,Shelley Nader,RS
      390111541854,Edward Renner I,AM
      941261588877,Ms. Lloyd Metz,DF
      211005531289,Sidney Marks,SE
      562902748834,Miss Joy Franey,ES
      911370005455,Julio Leffler,PE
      700812576647,Brett White,MS
      235450037061,Charles Botsford,PR""";

}