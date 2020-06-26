package uk.co.devproltd.dummy_service

import io.circe.generic.JsonCodec

@JsonCodec
case class Book(id: Long, title: String, author: String, year: Int)

object Books {

  val books = Vector(
    Book(
      id = 586853,
      title = """'Die Wand.' Mit Materialien. (Lernmaterialien)""",
      author = """Marlen Haushofer""",
      year = 1963
    ),
    Book(
      id = 35167685,
      title = """"Surely You're Joking, Mr. Feynman!": Adventures of a Curious Character""",
      author = """Richard P. Feynman""",
      year = 1985
    ),
    Book(
      id = 36631783,
      title = """12 Rules for Life: An Antidote to Chaos""",
      author = """Jordan B. Peterson""",
      year = 2018
    ),
    Book(
      id = 215224,
      title = """2001: A Space Odyssey (Space Odyssey, #1)""",
      author = """Arthur C. Clarke""",
      year = 1968
    ),
    Book(id = 642965, title = """A Child's Garden of Verses""", author = """Robert Louis Stevenson""", year = 1885),
    Book(id = 1876291, title = """A Christmas Carol""", author = """Charles Dickens""", year = 1843),
    Book(
      id = 25085141,
      title =
        """A companion booklet to "Functional Programming in Scala": Chapter notes, errata, hints, and answers to exercises""",
      author = """Rúnar Bjarnason""",
      year = 2015
    ),
    Book(id = 26244, title = """A Confession""", author = """Leo Tolstoy""", year = 1880),
    Book(id = 87577, title = """A Confession and Other Religious Writings""", author = """Leo Tolstoy""", year = 1987),
    Book(id = 947493, title = """A Double Barrelled Detective Story""", author = """Mark Twain""", year = 1902),
    Book(id = 44415738, title = """A Fall of Moondust""", author = """Arthur C. Clarke""", year = 1961),
    Book(id = 11074570, title = """A Good Man""", author = """Guy Vanderhaeghe""", year = 2011),
    Book(id = 763483, title = """A Murder is Announced""", author = """Agatha Christie""", year = 1950),
    Book(id = 22251137, title = """A Practical Guide to Ubuntu Linux""", author = """Mark G. Sobell""", year = 2007),
    Book(
      id = 34663135,
      title = """A River in Darkness:  One Man's Escape from North Korea""",
      author = """Masaji Ishikawa""",
      year = 2000
    ),
    Book(
      id = 102868,
      title = """A Study in Scarlet (Sherlock Holmes, #1)""",
      author = """Arthur Conan Doyle""",
      year = 1887
    ),
    Book(id = 1953, title = """A Tale of Two Cities""", author = """Charles Dickens""", year = 1859),
    Book(id = 1064084, title = """A Voyage to Arcturus""", author = """David  Lindsay""", year = 1920),
    Book(id = 122781, title = """A Walk Across America""", author = """Peter Jenkins""", year = 1979),
    Book(
      id = 25387599,
      title = """A Walk in the Woods: Rediscovering America on the Appalachian Trail""",
      author = """Bill Bryson""",
      year = 1998
    ),
    Book(id = 17863, title = """Accelerando""", author = """Charles Stross""", year = 2005),
    Book(id = 121410, title = """Adrift: Seventy-Six Days Lost at Sea""", author = """Steven Callahan""", year = 1986),
    Book(
      id = 10049061,
      title = """Adventures of a Younger Son (1897)""",
      author = """Edward John Trelawny""",
      year = 1974
    ),
    Book(
      id = 469571,
      title = """All the Pretty Horses (The Border Trilogy, #1)""",
      author = """Cormac McCarthy""",
      year = 1992
    ),
    Book(id = 40445, title = """Altered Carbon (Takeshi Kovacs, #1)""", author = """Richard K. Morgan""", year = 2002),
    Book(id = 743885, title = """Amelia""", author = """Henry Fielding""", year = 1751),
    Book(id = 78024, title = """And Quiet Flows the Don""", author = """Mikhail Sholokhov""", year = 1934),
    Book(id = 18053448, title = """Animal Farm""", author = """George Orwell""", year = 1945),
    Book(id = 40175, title = """Annapurna""", author = """Maurice Herzog""", year = 1951),
    Book(
      id = 15817934,
      title =
        """Anything Worth Doing: A true story of adventure, friendship and tragedy on the last of the West's great rivers""",
      author = """Jo Deurbrouck""",
      year = 2012
    ),
    Book(id = 825419, title = """Arabian Sands""", author = """Wilfred Thesiger""", year = 1959),
    Book(
      id = 784664,
      title =
        """As Far as My Feet Will Carry Me: The Extraordinary True Story of One Man's Escape from a Siberian Labour Camp and His 3-Year Trek to Freedom""",
      author = """Josef Martin Bauer""",
      year = 1955
    ),
    Book(id = 662, title = """Atlas Shrugged""", author = """Ayn Rand""", year = 1957),
    Book(id = 11026, title = """Barnaby Rudge""", author = """Charles Dickens""", year = 1841),
    Book(
      id = 6767361,
      title = """Beginning Java EE 6 Platform with GlassFish 3: From Novice to Professional""",
      author = """Antonio Goncalves""",
      year = 2009
    ),
    Book(
      id = 10462030,
      title = """Believing Bullshit: How Not to Get Sucked into an Intellectual Black Hole""",
      author = """Stephen Law""",
      year = 2011
    ),
    Book(
      id = 373399,
      title = """Beyond the Blue Event Horizon (Heechee Saga, #2)""",
      author = """Frederik Pohl""",
      year = 1980
    ),
    Book(
      id = 27831191,
      title = """Black Box Thinking: The Surprising Truth About Success""",
      author = """Matthew Syed""",
      year = 2015
    ),
    Book(id = 21718, title = """Blindsighted (Grant County, #1)""", author = """Karin Slaughter""", year = 2001),
    Book(id = 3180338, title = """Brave New World""", author = """Aldous Huxley""", year = 1932),
    Book(id = 1121924, title = """Brazilian Adventure""", author = """Peter  Fleming""", year = 1933),
    Book(id = 11139965, title = """Breakfast of Champions""", author = """Kurt Vonnegut Jr.""", year = 1973),
    Book(id = 48862, title = """Brighton Rock""", author = """Graham Greene""", year = 1938),
    Book(id = 588147, title = """Bulfinch's Mythology""", author = """Thomas Bulfinch""", year = 1855),
    Book(id = 18395049, title = """Butcher's Crossing""", author = """John  Williams""", year = 1960),
    Book(id = 533092, title = """Cameroon with Egbert""", author = """Dervla Murphy""", year = 1991),
    Book(id = 11431231, title = """Cancer Ward""", author = """Aleksandr Solzhenitsyn""", year = 1968),
    Book(id = 17192285, title = """Candide""", author = """Voltaire""", year = 1759),
    Book(id = 135479, title = """Cat's Cradle""", author = """Kurt Vonnegut Jr.""", year = 1963),
    Book(id = 168668, title = """Catch-22 (Catch-22, #1)""", author = """Joseph Heller""", year = 1961),
    Book(id = 12275939, title = """Červený kapitán""", author = """Dominik Dán""", year = 2007),
    Book(id = 89185, title = """Chasm City""", author = """Alastair Reynolds""", year = 2001),
    Book(id = 13161569, title = """Childhood's End""", author = """Arthur C. Clarke""", year = 1953),
    Book(
      id = 25563522,
      title = """Children of Time (Children of Time #1)""",
      author = """Adrian Tchaikovsky""",
      year = 2015
    ),
    Book(id = 23602777, title = """Chirurgovo srdce""", author = """Fjodor Uglov""", year = 1985),
    Book(id = 19387314, title = """Cities in Flight""", author = """James Blish""", year = 1970),
    Book(
      id = 3735293,
      title = """Clean Code: A Handbook of Agile Software Craftsmanship""",
      author = """Robert C. Martin""",
      year = 2007
    ),
    Book(id = 4845, title = """Code Complete""", author = """Steve McConnell""", year = 1993),
    Book(
      id = 44882,
      title = """Code: The Hidden Language of Computer Hardware and Software""",
      author = """Charles Petzold""",
      year = 1999
    ),
    Book(
      id = 18080417,
      title = """Cold: Extreme Adventures at the Lowest Temperatures on Earth""",
      author = """Ranulph Fiennes""",
      year = 2013
    ),
    Book(
      id = 34747849,
      title = """Computer Networking: A Top-Down Approach, Global Edition""",
      author = """James F. Kurose""",
      year = 2000
    ),
    Book(
      id = 8686650,
      title = """Continuous Delivery: Reliable Software Releases Through Build, Test, and Deployment Automation""",
      author = """Jez Humble""",
      year = 2010
    ),
    Book(
      id = 12544648,
      title = """Cracking the Coding Interview: 150 Programming Questions and Solutions""",
      author = """Gayle Laakmann McDowell""",
      year = 2008
    ),
    Book(
      id = 20459408,
      title = """Da Jesus Book: Hawaii Pidgin New Testament""",
      author = """Anonymous""",
      year = 2000
    ),
    Book(id = 138683, title = """Dark Fire (Matthew Shardlake, #2)""", author = """C.J. Sansom""", year = 2004),
    Book(id = 27833670, title = """Dark Matter""", author = """Blake Crouch""", year = 2016),
    Book(id = 58696, title = """David Copperfield""", author = """Charles Dickens""", year = 1850),
    Book(id = 214614, title = """Desert Solitaire""", author = """Edward Abbey""", year = 1968),
    Book(
      id = 85009,
      title = """Design Patterns: Elements of Reusable Object-Oriented Software""",
      author = """Erich Gamma""",
      year = 1994
    ),
    Book(id = 297851, title = """Desperate Remedies""", author = """Thomas Hardy""", year = 1871),
    Book(id = 79579, title = """Did I Ever Tell You How Lucky You Are?""", author = """Dr. Seuss""", year = 1972),
    Book(id = 44153, title = """Dirty Snow""", author = """Georges Simenon""", year = 1948),
    Book(id = 12224530, title = """Do Androids Dream of Electric Sheep?""", author = """Philip K. Dick""", year = 1968),
    Book(id = 42396658, title = """Doctor Zhivago""", author = """Boris Pasternak""", year = 1957),
    Book(
      id = 179133,
      title = """Domain-Driven Design: Tackling Complexity in the Heart of Software""",
      author = """Eric Evans""",
      year = 2003
    ),
    Book(id = 30075842, title = """Dombey and Son""", author = """Charles Dickens""", year = 1848),
    Book(id = 1382553, title = """Don'ts For Husbands""", author = """Blanche Ebbutt""", year = 1913),
    Book(id = 1238670, title = """Don'ts for Wives""", author = """Blanche Ebbutt""", year = 1913),
    Book(id = 17245, title = """Dracula""", author = """Bram Stoker""", year = 1897),
    Book(id = 137179, title = """Dreamers""", author = """Knut Hamsun""", year = 1904),
    Book(id = 1734861, title = """Dreamers""", author = """Knut Hamsun""", year = 1904),
    Book(id = 11323604, title = """Dune (Dune Chronicles, #1)""", author = """Frank Herbert""", year = 1965),
    Book(id = 17855756, title = """Dust (Silo, #3)""", author = """Hugh Howey""", year = 2013),
    Book(
      id = 22719418,
      title = """Effective Java: A Programming Language Guide (Java Series)""",
      author = """Joshua Bloch""",
      year = 2001
    ),
    Book(id = 1419278, title = """Eight Feet in the Andes""", author = """Dervla Murphy""", year = 1983),
    Book(id = 375802, title = """Ender's Game (Ender's Saga, #1)""", author = """Orson Scott Card""", year = 1985),
    Book(
      id = 931867,
      title = """Endurance: Shackleton's Incredible Voyage""",
      author = """Alfred Lansing""",
      year = 1959
    ),
    Book(
      id = 85012,
      title = """Enterprise Integration Patterns: Designing, Building, and Deploying Messaging Solutions""",
      author = """Gregor Hohpe""",
      year = 2003
    ),
    Book(id = 59142, title = """Eugénie Grandet""", author = """Honoré de Balzac""", year = 1833),
    Book(id = 31463, title = """Far From the Madding Crowd""", author = """Thomas Hardy""", year = 1874),
    Book(id = 9780676, title = """Far to Go""", author = """Alison Pick""", year = 2010),
    Book(
      id = 4767164,
      title = """Farther Than Any Man: The Rise and Fall of Captain James Cook""",
      author = """Martin Dugard""",
      year = 2001
    ),
    Book(id = 888369, title = """Farthest North""", author = """Fridtjof Nansen""", year = 1897),
    Book(id = 339466, title = """Fatu Hiva: Back to Nature""", author = """Thor Heyerdahl""", year = 1938),
    Book(
      id = 995091,
      title = """Five Go to Mystery Moor (The Famous Five, #13)""",
      author = """Enid Blyton""",
      year = 1942
    ),
    Book(
      id = 1230584,
      title = """Five Go to Smuggler's Top (The Famous Five #4)""",
      author = """Enid Blyton""",
      year = 1945
    ),
    Book(id = 1934627, title = """Five Weeks in a Balloon""", author = """Jules Verne""", year = 1863),
    Book(
      id = 685404,
      title = """Flawless Consulting: A Guide to Getting Your Expertise Used""",
      author = """Peter Block""",
      year = 1987
    ),
    Book(id = 18378, title = """Flowers for Algernon""", author = """Daniel Keyes""", year = 1966),
    Book(id = 22035, title = """Fools Die""", author = """Mario Puzo""", year = 1978),
    Book(id = 16433, title = """Forever Odd (Odd Thomas, #2)""", author = """Dean Koontz""", year = 2005),
    Book(id = 31380440, title = """Foundation (Foundation, #1)""", author = """Isaac Asimov""", year = 1951),
    Book(
      id = 1202,
      title = """Freakonomics: A Rogue Economist Explores the Hidden Side of Everything""",
      author = """Steven D. Levitt""",
      year = 2005
    ),
    Book(id = 65948, title = """From the Corner of His Eye""", author = """Dean Koontz""", year = 2000),
    Book(
      id = 163921,
      title = """Full Tilt: Ireland to India with a Bicycle""",
      author = """Dervla Murphy""",
      year = 1965
    ),
    Book(id = 13541678, title = """Functional Programming in Scala""", author = """Rúnar Bjarnason""", year = 2013),
    Book(id = 218427, title = """Gateway (Heechee Saga, #1)""", author = """Frederik Pohl""", year = 1977),
    Book(id = 27082, title = """Gipsy Moth Circles the World""", author = """Francis Chichester""", year = 1967),
    Book(id = 252452, title = """Glorious Adventure""", author = """Richard Halliburton""", year = 1927),
    Book(
      id = 64222,
      title = """Going Postal (Discworld, #33; Moist von Lipwig, #1)""",
      author = """Terry Pratchett""",
      year = 2004
    ),
    Book(
      id = 233671,
      title = """Going Postal (Discworld, #36; Moist Von Lipwig, #1)""",
      author = """Terry Pratchett""",
      year = 2004
    ),
    Book(id = 415, title = """Gravity's Rainbow""", author = """Thomas Pynchon""", year = 1973),
    Book(id = 2623, title = """Great Expectations""", author = """Charles Dickens""", year = 1861),
    Book(id = 871287, title = """Green Eggs and Ham""", author = """Dr. Seuss""", year = 1960),
    Book(id = 8493827, title = """Greybeard""", author = """Brian W. Aldiss""", year = 1964),
    Book(
      id = 4268826,
      title = """Growing Object-Oriented Software, Guided by Tests""",
      author = """Steve  Freeman""",
      year = 2009
    ),
    Book(id = 342049, title = """Growth of the Soil""", author = """Knut Hamsun""", year = 1917),
    Book(id = 16059729, title = """Growth of the Soil""", author = """Knut Hamsun""", year = 1917),
    Book(
      id = 12992951,
      title = """Hacking Exposed 7: Network Security Secrets and Solutions""",
      author = """Stuart McClure""",
      year = 2003
    ),
    Book(id = 7775, title = """Happy Birthday to You!""", author = """Dr. Seuss""", year = 1959),
    Book(id = 21005523, title = """Hard to Be a God""", author = """Arkady Strugatsky""", year = 1964),
    Book(id = 1159031, title = """Hashish: A Smuggler's Tale""", author = """Henry de Monfreid""", year = 1933),
    Book(id = 58128, title = """Head First Design Patterns""", author = """Eric Freeman""", year = 2004),
    Book(id = 4900, title = """Heart of Darkness""", author = """Joseph Conrad""", year = 1899),
    Book(id = 7962596, title = """Helliconia (Helliconia, #1-3)""", author = """Brian W. Aldiss""", year = 1983),
    Book(id = 12383258, title = """HHhH""", author = """Laurent Binet""", year = 2010),
    Book(
      id = 443188,
      title = """Hooded Americanism: The History of the Ku Klux Klan""",
      author = """David M. Chalmers""",
      year = 1965
    ),
    Book(id = 939753, title = """Hothouse""", author = """Brian W. Aldiss""", year = 1962),
    Book(id = 1212772, title = """How the Grinch Stole Christmas!""", author = """Dr. Seuss""", year = 1957),
    Book(
      id = 39078159,
      title = """How To Be Right… in a World Gone Wrong""",
      author = """James O'Brien""",
      year = 2018
    ),
    Book(
      id = 6600228,
      title = """How To Get Things Done Without Trying Too Hard""",
      author = """Richard Templar""",
      year = 2009
    ),
    Book(
      id = 39863499,
      title = """How to Think Like a Roman Emperor: The Stoic Philosophy of Marcus Aurelius""",
      author = """Donald J. Robertson""",
      year = 2019
    ),
    Book(id = 697169, title = """How to Win Friends and Influence People""", author = """Dale Carnegie""", year = 1936),
    Book(id = 32585, title = """Hunger""", author = """Knut Hamsun""", year = 1890),
    Book(id = 77566, title = """Hyperion (Hyperion Cantos #1)""", author = """Dan Simmons""", year = 1989),
    Book(
      id = 23237460,
      title = """I Heart Logs: Event Data, Stream Processing, and Data Integration""",
      author = """Jay Kreps""",
      year = 2014
    ),
    Book(id = 41804, title = """I, Robot (Robot, #0.1)""", author = """Isaac Asimov""", year = 1950),
    Book(id = 1419323, title = """In Ethiopia with a Mule""", author = """Dervla Murphy""", year = 1968),
    Book(
      id = 93428,
      title =
        """In the Empire of Genghis Khan: An Amazing Odyssey Through the Lands of the Most Feared Conquerors in History""",
      author = """Stanley  Stewart""",
      year = 2000
    ),
    Book(
      id = 298641,
      title = """In the Land of White Death: An Epic Story of Survival in the Siberian Arctic""",
      author = """Valerian Albanov""",
      year = 1917
    ),
    Book(id = 118459, title = """In the South Seas""", author = """Robert Louis Stevenson""", year = 1896),
    Book(id = 32592, title = """In Wonderland""", author = """Knut Hamsun""", year = 1903),
    Book(
      id = 28815,
      title = """Influence: The Psychology of Persuasion""",
      author = """Robert B. Cialdini""",
      year = 1984
    ),
    Book(
      id = 2999185,
      title = """Inspector French and the Starvel Tragedy""",
      author = """Freeman Wills Crofts""",
      year = 1927
    ),
    Book(
      id = 2370057,
      title = """Inspector French's Greatest Case (Inspector French #1)""",
      author = """Freeman Wills Crofts""",
      year = 1924
    ),
    Book(
      id = 24099718,
      title =
        """Inspector Maigret Omnibus 1: Pietr the Latvian, The Hanged Man of Saint-Pholien, The Carter of 'La Providence', The Grand Banks Café (Maigret Boxset)""",
      author = """Georges Simenon""",
      year = 2014
    ),
    Book(id = 18230265, title = """Instant Spring Security Starter""", author = """Piotr Jagielski""", year = 2013),
    Book(id = 32439, title = """Intensity""", author = """Dean Koontz""", year = 1987),
    Book(
      id = 447449,
      title = """Into Africa: The Dramatic Retelling of the Stanley-Livingston Story""",
      author = """Martin Dugard""",
      year = 2002
    ),
    Book(id = 1845, title = """Into the Wild""", author = """Jon Krakauer""", year = 1996),
    Book(
      id = 1898,
      title = """Into Thin Air: A Personal Account of the Mount Everest Disaster""",
      author = """Jon Krakauer""",
      year = 1997
    ),
    Book(
      id = 27671723,
      title = """Introduction to Networking: How the Internet Works""",
      author = """Charles Severance""",
      year = 2015
    ),
    Book(
      id = 1053319,
      title = """Iron Coffins: A Personal Account of the German U-boat Battles of World War II""",
      author = """Herbert A. Werner""",
      year = 1968
    ),
    Book(id = 1051446, title = """Irrationality""", author = """Stuart Sutherland""", year = 1992),
    Book(id = 18342, title = """It""", author = """Stephen King""", year = 1986),
    Book(
      id = 2775096,
      title = """It Walks by Night (Henri Bencolin, #1)""",
      author = """John Dickson Carr""",
      year = 1930
    ),
    Book(
      id = 5750628,
      title = """Johannes Cabal the Necromancer (Johannes Cabal, #1)""",
      author = """Jonathan L. Howard""",
      year = 2009
    ),
    Book(id = 4211657, title = """John Halifax, Gentleman""", author = """Dinah Maria Mulock Craik""", year = 1856),
    Book(id = 31202, title = """Jonathan Wild""", author = """Henry Fielding""", year = 1743),
    Book(id = 110170, title = """Joseph Andrews""", author = """Henry Fielding""", year = 1742),
    Book(id = 12395, title = """Journey to the End of the Night""", author = """Louis-Ferdinand Céline""", year = 1932),
    Book(id = 3434366, title = """Jozef Mak""", author = """Jozef Cíger Hronský""", year = 1933),
    Book(id = 50798, title = """Jude the Obscure""", author = """Thomas Hardy""", year = 1895),
    Book(
      id = 6509616,
      title = """Just a Little Run Around the World: 5 Years, 3 Packs of Wolves and 53 Pairs of Shoes""",
      author = """Rosie Swale Pope""",
      year = 2009
    ),
    Book(id = 67935, title = """Just Cause""", author = """John Katzenbach""", year = 1992),
    Book(id = 790171, title = """Kon-Tiki""", author = """Thor Heyerdahl""", year = 1948),
    Book(id = 920941, title = """Land under England""", author = """Joseph  O'Neill""", year = 1935),
    Book(
      id = 9282423,
      title = """Learn You a Haskell for Great Good!: A Beginner's Guide""",
      author = """Miran Lipovača""",
      year = 2011
    ),
    Book(id = 8855321, title = """Leviathan Wakes (The Expanse, #1)""", author = """James S.A. Corey""", year = 2011),
    Book(id = 16435, title = """Life Expectancy""", author = """Dean Koontz""", year = 2004),
    Book(id = 50667, title = """Little Big Man (Little Big Man #1)""", author = """Thomas Berger""", year = 1964),
    Book(id = 954674, title = """Little Brother (Little Brother, #1)""", author = """Cory Doctorow""", year = 2008),
    Book(id = 31250, title = """Little Dorrit""", author = """Charles Dickens""", year = 1855),
    Book(id = 7604, title = """Lolita""", author = """Vladimir Nabokov""", year = 1955),
    Book(id = 256008, title = """Lonesome Dove""", author = """Larry McMurtry""", year = 1985),
    Book(id = 137195, title = """Look Back on Happiness""", author = """Knut Hamsun""", year = 1912),
    Book(id = 24611455, title = """Maigret (Maigret, #19)""", author = """Georges Simenon""", year = 1934),
    Book(
      id = 32701385,
      title = """Maigret and the Man on the Bench (Maigret #41)""",
      author = """Georges Simenon""",
      year = 1953
    ),
    Book(id = 3432707, title = """Maigret Sets A Trap""", author = """Georges Simenon""", year = 1955),
    Book(id = 20652212, title = """Maigret Stonewalled""", author = """Georges Simenon""", year = 1931),
    Book(
      id = 28039960,
      title = """Maigret's Holiday (Inspector Maigret)""",
      author = """Georges Simenon""",
      year = 1947
    ),
    Book(
      id = 43518948,
      title = """Maigret's Madwoman: Inspector Maigret #72""",
      author = """Georges Simenon""",
      year = 1970
    ),
    Book(id = 6422238, title = """Makers""", author = """Cory Doctorow""", year = 2009),
    Book(id = 364284, title = """Man and Superman""", author = """George Bernard Shaw""", year = 1903),
    Book(id = 367215, title = """Man Plus (Man Plus #1)""", author = """Frederik Pohl""", year = 1976),
    Book(id = 1990, title = """Martin Chuzzlewit""", author = """Charles Dickens""", year = 1844),
    Book(
      id = 222146,
      title = """Masters of Doom: How Two Guys Created an Empire and Transformed Pop Culture""",
      author = """David Kushner""",
      year = 2003
    ),
    Book(
      id = 141354,
      title = """Mawson's Will: The Greatest Polar Survival Story Ever Written""",
      author = """Lennard Bickel""",
      year = 1977
    ),
    Book(
      id = 5608715,
      title = """Microsoft .NET: Architecting Applications for the Enterprise""",
      author = """Dino Esposito""",
      year = 2014
    ),
    Book(id = 271276, title = """Middlemarch""", author = """George Eliot""", year = 1871),
    Book(id = 34870901, title = """Money: Know More, Make More, Give More""", author = """Rob Moore""", year = 2017),
    Book(id = 115538, title = """Moonfleet""", author = """John Meade Falkner""", year = 1898),
    Book(id = 1108108, title = """Muddling through in Madagascar""", author = """Dervla Murphy""", year = 1985),
    Book(id = 238727, title = """My First Summer in the Sierra""", author = """John Muir""", year = 1911),
    Book(
      id = 61118,
      title = """My Traitor's Heart: A South African Exile Returns to Face His Country, His Tribe, and His Conscience""",
      author = """Rian Malan""",
      year = 1990
    ),
    Book(id = 32586, title = """Mysteries""", author = """Knut Hamsun""", year = 1892),
    Book(id = 967116, title = """Mysteries""", author = """Knut Hamsun""", year = 1892),
    Book(id = 21269131, title = """Nature Encyclopedia""", author = """D.K. Publishing""", year = 2006),
    Book(id = 22328, title = """Neuromancer (Sprawl, #1)""", author = """William Gibson""", year = 1984),
    Book(id = 26156469, title = """Never Split the Difference""", author = """Chris Voss""", year = 2016),
    Book(id = 14497, title = """Neverwhere (London Below, #1)""", author = """Neil Gaiman""", year = 1996),
    Book(id = 2300590, title = """New Arabian Nights""", author = """Robert Louis Stevenson""", year = 1882),
    Book(id = 556661, title = """News From Tartary""", author = """Peter  Fleming""", year = 1936),
    Book(id = 10135911, title = """NHibernate 3.0 Cookbook""", author = """Jason Dentler""", year = 2010),
    Book(id = 325085, title = """Nicholas Nickleby""", author = """Charles Dickens""", year = 1839),
    Book(
      id = 47989,
      title = """Night Watch (Discworld, #29; City Watch, #6)""",
      author = """Terry Pratchett""",
      year = 2002
    ),
    Book(id = 936221, title = """Nineteen Eighty-Four""", author = """George Orwell""", year = 1949),
    Book(id = 687938, title = """Non-Stop""", author = """Brian W. Aldiss""", year = 1958),
    Book(
      id = 18757050,
      title = """NoSQL Distilled: A Brief Guide to the Emerging World of Polyglot Persistence""",
      author = """Pramod J. Sadalage""",
      year = 2012
    ),
    Book(
      id = 16194404,
      title = """OCEJWCD Study Companion: Certified Expert Java EE 6 Web Component Developer (Oracle Exam 1Z0-899)""",
      author = """Charles Lyons""",
      year = 2012
    ),
    Book(id = 14995, title = """Odd Thomas (Odd Thomas, #1)""", author = """Dean Koontz""", year = 2003),
    Book(id = 890, title = """Of Mice and Men""", author = """John Steinbeck""", year = 1937),
    Book(id = 191139, title = """Oh, the Places You'll Go!""", author = """Dr. Seuss""", year = 1990),
    Book(id = 51964, title = """Old Man's War (Old Man's War, #1)""", author = """John Scalzi""", year = 2005),
    Book(id = 18254, title = """Oliver Twist""", author = """Charles Dickens""", year = 1839),
    Book(id = 22028, title = """Omerta""", author = """Mario Puzo""", year = 1999),
    Book(
      id = 1108118,
      title = """On a Shoestring to Coorg : An Experience of Southern India""",
      author = """Dervla Murphy""",
      year = 1976
    ),
    Book(id = 32587, title = """On Overgrown Paths""", author = """Knut Hamsun""", year = 1949),
    Book(
      id = 852538,
      title = """One Day in the Life of Ivan Denisovich""",
      author = """Aleksandr Solzhenitsyn""",
      year = 1962
    ),
    Book(
      id = 14628509,
      title = """Only Beautiful, Please: A British Diplomat in North Korea""",
      author = """John Everard""",
      year = 2012
    ),
    Book(
      id = 17374825,
      title = """Operating Systems: Three Easy Pieces""",
      author = """Remzi H. Arpaci-Dusseau""",
      year = 2012
    ),
    Book(
      id = 542429,
      title = """Ordeal by Hunger: The Story of the Donner Party""",
      author = """George R. Stewart""",
      year = 1936
    ),
    Book(id = 31244, title = """Our Mutual Friend""", author = """Charles Dickens""", year = 1865),
    Book(id = 23602562, title = """Our Souls at Night""", author = """Kent Haruf""", year = 2015),
    Book(id = 1934000, title = """Out Stealing Horses""", author = """Per Petterson""", year = 2003),
    Book(
      id = 174354,
      title = """Over the Edge of the World: Magellan's Terrifying Circumnavigation of the Globe""",
      author = """Laurence Bergreen""",
      year = 2003
    ),
    Book(id = 32590, title = """Pan""", author = """Knut Hamsun""", year = 1894),
    Book(id = 967118, title = """Pan""", author = """Knut Hamsun""", year = 1894),
    Book(id = 15997, title = """Paradise Lost""", author = """John Milton""", year = 1667),
    Book(
      id = 70156,
      title = """Patterns of Enterprise Application Architecture""",
      author = """Martin Fowler""",
      year = 2002
    ),
    Book(id = 6461806, title = """Père Goriot""", author = """Honoré de Balzac""", year = 1835),
    Book(id = 18114335, title = """Pietr the Latvian""", author = """Georges Simenon""", year = 1931),
    Book(id = 13644581, title = """Podnikání v USA""", author = """John Vanhara""", year = 2012),
    Book(
      id = 21353564,
      title =
        """Power Up; Speak Up; Be Heard: Simple steps to be a savvy and influential communicator and make yourself heard and understood""",
      author = """Kay White""",
      year = 2012
    ),
    Book(
      id = 18340529,
      title = """Practical Unit Testing with JUnit and Mockito""",
      author = """Tomek Kaczanowski""",
      year = 2013
    ),
    Book(
      id = 4102,
      title = """Practices of an Agile Developer: Working in the Real World""",
      author = """Venkat Subramaniam""",
      year = 2006
    ),
    Book(
      id = 25509140,
      title = """Pragmatic Scala: Create Expressive, Concise, and Scalable Applications""",
      author = """Venkat Subramaniam""",
      year = 2015
    ),
    Book(id = 1885, title = """Pride and Prejudice""", author = """Jane Austen""", year = 1813),
    Book(
      id = 6863661,
      title = """Pro Business Applications with Silverlight 4""",
      author = """Chris        Anderson""",
      year = 2010
    ),
    Book(id = 6503209, title = """Pro C# 2010 and the .NET 4 Platform""", author = """Andrew Troelsen""", year = 2009),
    Book(
      id = 9300619,
      title =
        """Professional Windows Phone 7 Application Development: Building Applications and Games Using Visual Studio, Silverlight, and XNA""",
      author = """Nick Randolph""",
      year = 2010
    ),
    Book(id = 3032445, title = """Pudd'nhead Wilson""", author = """Mark Twain""", year = 1893),
    Book(id = 594288, title = """Purely Functional Data Structures""", author = """Chris Okasaki""", year = 1996),
    Book(
      id = 56153,
      title = """QED: The Strange Theory of Light and Matter""",
      author = """Richard P. Feynman""",
      year = 1985
    ),
    Book(id = 8805449, title = """R.U.R. & War with the Newts""", author = """Karel Čapek""", year = 2011),
    Book(id = 112520, title = """Rama II (Rama, #2)""", author = """Arthur C. Clarke""", year = 1989),
    Book(
      id = 22251127,
      title = """Reactive Messaging Patterns with the Actor Model: Applications and Integration in Scala and Akka""",
      author = """Vaughn Vernon""",
      year = 2014
    ),
    Book(
      id = 12600138,
      title = """Ready Player One (Ready Player One, #1)""",
      author = """Ernest Cline""",
      year = 2011
    ),
    Book(id = 34517, title = """Reaper Man (Discworld, #11; Death, #2)""", author = """Terry Pratchett""", year = 1991),
    Book(id = 43592998, title = """Recursion""", author = """Blake Crouch""", year = 2019),
    Book(
      id = 788714,
      title =
        """Regular Expression Pocket Reference: Regular Expressions for Perl, Ruby, PHP, Python, C, Java and .NET""",
      author = """Tony Stubblebine""",
      year = 2007
    ),
    Book(
      id = 1069827,
      title = """Release It!: Design and Deploy Production-Ready Software (Pragmatic Programmers)""",
      author = """Michael T. Nygard""",
      year = 2007
    ),
    Book(id = 25251214, title = """Rendezvous with Rama (Rama, #1)""", author = """Arthur C. Clarke""", year = 1973),
    Book(
      id = 89187,
      title = """Revelation Space (Revelation Space, #1)""",
      author = """Alastair Reynolds""",
      year = 2000
    ),
    Book(id = 69571, title = """Rich Dad, Poor Dad""", author = """Robert T. Kiyosaki""", year = 1997),
    Book(
      id = 81922,
      title = """Rich Dad's Cashflow Quadrant: Rich Dad's Guide to Financial Freedom""",
      author = """Robert T. Kiyosaki""",
      year = 1998
    ),
    Book(id = 165446, title = """Ride the Wind""", author = """Lucia St. Clair Robson""", year = 1982),
    Book(id = 61179, title = """Ringworld (Ringworld, #1)""", author = """Larry Niven""", year = 1970),
    Book(
      id = 9152282,
      title = """River of Darkness: Francisco Orellana's Legendary Voyage of Death and Discovery Down the Amazon""",
      author = """Buddy Levy""",
      year = 2011
    ),
    Book(id = 2932, title = """Robinson Crusoe""", author = """Daniel Defoe""", year = 1719),
    Book(
      id = 13218026,
      title = """Scala in Action: Covers Scala 2.10""",
      author = """Nilanjan Raychaudhuri""",
      year = 2012
    ),
    Book(
      id = 11350167,
      title = """Scott's Last Expedition: The Journals of Captain R.F. Scott""",
      author = """Robert Falcon Scott""",
      year = 1913
    ),
    Book(
      id = 272991,
      title = """Secrets Of The Baby Whisperer: How to Calm, Connect and Communicate with your Baby""",
      author = """Tracy Hogg""",
      year = 2000
    ),
    Book(id = 270032, title = """Seven Years in Tibet""", author = """Heinrich Harrer""", year = 1953),
    Book(id = 22816087, title = """Seveneves""", author = """Neal Stephenson""", year = 2015),
    Book(id = 632484, title = """Shallow Soil""", author = """Knut Hamsun""", year = 1893),
    Book(
      id = 2452324,
      title = """Shares Made Simple: A Beginner's Guide to the Stock Market""",
      author = """Rodney Hobson""",
      year = 2007
    ),
    Book(id = 388997, title = """She Stoops to Conquer""", author = """Oliver Goldsmith""", year = 1773),
    Book(id = 17612908, title = """Shift (Silo #2)""", author = """Hugh Howey""", year = 2013),
    Book(
      id = 82994,
      title = """Silence on the Wire: A Field Guide to Passive Reconnaissance and Indirect Attacks""",
      author = """Michal Zalewski""",
      year = 2005
    ),
    Book(id = 751994, title = """Silverland""", author = """Dervla Murphy""", year = 2006),
    Book(
      id = 27968891,
      title = """Site Reliability Engineering: How Google Runs Production Systems""",
      author = """Betsy Beyer""",
      year = 2016
    ),
    Book(id = 408148, title = """Skeletons on the Zahara""", author = """Dean King""", year = 2004),
    Book(id = 4981, title = """Slaughterhouse-Five""", author = """Kurt Vonnegut Jr.""", year = 1969),
    Book(id = 20179902, title = """Small Gods (Discworld, #13)""", author = """Terry Pratchett""", year = 1992),
    Book(id = 10718, title = """Something Happened""", author = """Joseph Heller""", year = 1974),
    Book(
      id = 533088,
      title = """South from the Limpopo: Travels Through South Africa""",
      author = """Dervla Murphy""",
      year = 1997
    ),
    Book(id = 1198855, title = """South Wind""", author = """Norman Douglas""", year = 1917),
    Book(id = 21010, title = """Spares""", author = """Michael Marshall Smith""", year = 1996),
    Book(id = 2537898, title = """Spree""", author = """T.J. MacGregor""", year = 1992),
    Book(id = 8801723, title = """Spring in Action, Third Edition""", author = """Craig Walls""", year = 2004),
    Book(id = 525304, title = """Star Maker""", author = """Olaf Stapledon""", year = 1937),
    Book(id = 223380, title = """Stories of Your Life and Others""", author = """Ted Chiang""", year = 2002),
    Book(
      id = 451151,
      title = """Strange Case of Dr. Jekell & Mr. Hyde""",
      author = """Robert Louis Stevenson""",
      year = 1886
    ),
    Book(
      id = 1347423,
      title = """Stranger in the Forest: On Foot Across Borneo""",
      author = """Eric Hansen""",
      year = 1988
    ),
    Book(id = 54812, title = """Streets of Laredo""", author = """Larry McMurtry""", year = 1993),
    Book(id = 394469, title = """Suttree""", author = """Cormac McCarthy""", year = 1979),
    Book(
      id = 9941715,
      title = """Switch: How To Change Things When Change Is Hard""",
      author = """Chip Heath""",
      year = 2010
    ),
    Book(id = 17368844, title = """Tales of Mystery and Imagination""", author = """Edgar Allan Poe""", year = 1842),
    Book(
      id = 125270,
      title = """The 7 Habits of Highly Effective People""",
      author = """Stephen R. Covey""",
      year = 1989
    ),
    Book(id = 836924, title = """The Adventures of Baron Münchausen""", author = """Rudolf Erich Raspe""", year = 1781),
    Book(id = 2956, title = """The Adventures of Huckleberry Finn""", author = """Mark Twain""", year = 1884),
    Book(
      id = 709007,
      title = """The Adventures of the Black Girl in Her Search for God""",
      author = """George Bernard Shaw""",
      year = 1932
    ),
    Book(id = 425208, title = """The Algorithm Design Manual""", author = """Steven S. Skiena""", year = 1997),
    Book(
      id = 6991963,
      title = """The Amateur Emigrant / The Silverado Squatters / The Silverado Diary (Facsimile)""",
      author = """Robert Louis Stevenson""",
      year = 1895
    ),
    Book(
      id = 6487349,
      title = """The Art of Unit Testing: With Examples in .NET""",
      author = """Roy Osherove""",
      year = 2009
    ),
    Book(id = 140590, title = """The Blue Room""", author = """Georges Simenon""", year = 1960),
    Book(
      id = 16319,
      title = """The Body in the Library (Miss Marple, #3)""",
      author = """Agatha Christie""",
      year = 1942
    ),
    Book(id = 893136, title = """The Book Thief""", author = """Markus Zusak""", year = 2005),
    Book(id = 1852, title = """The Call of the Wild""", author = """Jack London""", year = 1903),
    Book(
      id = 18114332,
      title = """The Carter of 'La Providence' (Maigret, #2)""",
      author = """Georges Simenon""",
      year = 1931
    ),
    Book(id = 460569, title = """The Cat in the Hat""", author = """Dr. Seuss""", year = 1957),
    Book(id = 518803, title = """The Catcher in the Rye""", author = """J.D. Salinger""", year = 1951),
    Book(id = 22388041, title = """The City and the Stars""", author = """Arthur C. Clarke""", year = 1956),
    Book(id = 11138378, title = """The Colour of Magic (Discworld, #1)""", author = """Terry Pratchett""", year = 1983),
    Book(id = 968863, title = """The Complete Roderick""", author = """John Sladek""", year = 1992),
    Book(
      id = 18526932,
      title = """The Cornish Coast Murder (Inspector Bigswell)""",
      author = """John Bude""",
      year = 1935
    ),
    Book(id = 7126, title = """The Count of Monte Cristo""", author = """Alexandre Dumas""", year = 1844),
    Book(
      id = 43093526,
      title = """The Cruel Stars (The Cruel Stars, #1)""",
      author = """John Birmingham""",
      year = 2019
    ),
    Book(
      id = 18154,
      title = """The Cuckoo's Egg: Tracking a Spy Through the Maze of Computer Espionage""",
      author = """Clifford Stoll""",
      year = 1989
    ),
    Book(id = 18194, title = """The Cyberiad""", author = """Stanisław Lem""", year = 1965),
    Book(id = 34728560, title = """The Dark Light Years""", author = """Brian W. Aldiss""", year = 1964),
    Book(id = 19477260, title = """The Deep Range (GOLLANCZ S.F.)""", author = """Arthur C. Clarke""", year = 1957),
    Book(
      id = 995796,
      title = """The Demon-Haunted World: Science as a Candle in the Dark""",
      author = """Carl Sagan""",
      year = 1996
    ),
    Book(id = 756970, title = """The Dispossessed""", author = """Ursula K. Le Guin""", year = 1974),
    Book(id = 509784, title = """The End of Eternity""", author = """Isaac Asimov""", year = 1955),
    Book(id = 1115866, title = """The Famous Five [4 Adventures]""", author = """Enid Blyton""", year = 1942),
    Book(
      id = 19161852,
      title = """The Fifth Season (The Broken Earth, #1)""",
      author = """N.K. Jemisin""",
      year = 2015
    ),
    Book(id = 21611, title = """The Forever War (The Forever War, #1)""", author = """Joe Haldeman""", year = 1974),
    Book(
      id = 2429135,
      title = """The Girl with the Dragon Tattoo (Millennium, #1)""",
      author = """Stieg Larsson""",
      year = 2005
    ),
    Book(id = 22034, title = """The Godfather""", author = """Mario Puzo""", year = 1969),
    Book(id = 17736403, title = """The Gods Themselves""", author = """Isaac Asimov""", year = 1972),
    Book(id = 7629, title = """The Good Soldier Švejk""", author = """Jaroslav Hašek""", year = 1923),
    Book(id = 20949483, title = """The Grand Banks Café (Maigret, #9)""", author = """Georges Simenon""", year = 1931),
    Book(id = 4395, title = """The Grapes of Wrath""", author = """John Steinbeck""", year = 1939),
    Book(id = 2213661, title = """The Graveyard Book""", author = """Neil Gaiman""", year = 2008),
    Book(id = 4672, title = """The Great Gatsby""", author = """F. Scott Fitzgerald""", year = 1925),
    Book(id = 6359464, title = """The Great Railway Bazaar""", author = """Paul Theroux""", year = 1975),
    Book(
      id = 70561,
      title = """The Gulag Archipelago 1918–1956 (Abridged)""",
      author = """Aleksandr Solzhenitsyn""",
      year = 1973
    ),
    Book(
      id = 18114333,
      title = """The Hanged Man of Saint-Pholien (Maigret, #4)""",
      author = """Georges Simenon""",
      year = 1931
    ),
    Book(id = 21570139, title = """The Heart of Unaga""", author = """Ridgwell Cullum""", year = 1920),
    Book(id = 99329, title = """The History of Tom Jones, a Foundling""", author = """Henry Fielding""", year = 1749),
    Book(
      id = 11,
      title = """The Hitchhiker's Guide to the Galaxy (Hitchhiker's Guide to the Galaxy, #1)""",
      author = """Douglas Adams""",
      year = 1979
    ),
    Book(
      id = 25034042,
      title = """The Hog's Back Mystery (Inspector French #10)""",
      author = """Freeman Wills Crofts""",
      year = 1933
    ),
    Book(id = 8921, title = """The Hound of the Baskervilles""", author = """Arthur Conan Doyle""", year = 1901),
    Book(
      id = 7012734,
      title = """The Idiot (Barnes & Noble Classics Series)""",
      author = """Fyodor Dostoyevsky""",
      year = 1869
    ),
    Book(
      id = 2615,
      title = """The Innovator's Dilemma: The Revolutionary Book that Will Change the Way You Do Business""",
      author = """Clayton M. Christensen""",
      year = 1997
    ),
    Book(id = 939740, title = """The Integral Trees (The State, #2)""", author = """Larry Niven""", year = 1983),
    Book(
      id = 12275,
      title = """The Intelligent Woman's Guide to Socialism, Capitalism, Sovietism and Fascism""",
      author = """George Bernard Shaw""",
      year = 1928
    ),
    Book(id = 251633, title = """The Invincible""", author = """Stanisław Lem""", year = 1964),
    Book(id = 567707, title = """The Island of Dr. Moreau""", author = """H.G. Wells""", year = 1896),
    Book(id = 24662040, title = """The Judge's House (Maigret, #21)""", author = """Georges Simenon""", year = 1940),
    Book(id = 141077, title = """The Kreutzer Sonata""", author = """Leo Tolstoy""", year = 1889),
    Book(
      id = 1613080,
      title = """The Launching of Roger Brook (Roger Brook, #1)""",
      author = """Dennis Wheatley""",
      year = 1947
    ),
    Book(
      id = 18423,
      title = """The Left Hand of Darkness (Hainish Cycle #4)""",
      author = """Ursula K. Le Guin""",
      year = 1969
    ),
    Book(
      id = 74397,
      title = """The Life and Extraordinary Adventures of Private Ivan Chonkin""",
      author = """Vladimir Voinovich""",
      year = 1969
    ),
    Book(id = 1242525, title = """The Lodger""", author = """Marie Belloc Lowndes""", year = 1913),
    Book(
      id = 7145094,
      title = """The Longest Winter: Scott's Other Heroes""",
      author = """Meredith Hooper""",
      year = 2010
    ),
    Book(id = 235061, title = """The Lorax""", author = """Dr. Seuss""", year = 1971),
    Book(
      id = 24162502,
      title = """The Madman of Bergerac: Inspector Maigret #15""",
      author = """Georges Simenon""",
      year = 1932
    ),
    Book(id = 16884, title = """The Making of the Atomic Bomb""", author = """Richard Rhodes""", year = 1986),
    Book(id = 25539212, title = """The Man Who Fell to Earth""", author = """Walter Tevis""", year = 1963),
    Book(id = 30164694, title = """The Man Who Watched Trains Go By""", author = """Georges Simenon""", year = 1938),
    Book(id = 432391, title = """The Marsh Arabs""", author = """Wilfred Thesiger""", year = 1964),
    Book(id = 76778, title = """The Martian Chronicles""", author = """Ray Bradbury""", year = 1949),
    Book(id = 223175, title = """The Master of Ballantrae""", author = """Robert Louis Stevenson""", year = 1889),
    Book(id = 56759, title = """The Mayor of Casterbridge""", author = """Thomas Hardy""", year = 1886),
    Book(id = 119512, title = """The Melancholy of Resistance""", author = """László Krasznahorkai""", year = 1989),
    Book(id = 23398787, title = """The Misty Harbour (Maigret, #12)""", author = """Georges Simenon""", year = 1931),
    Book(id = 19060872, title = """The Monk Who Sold his Ferrari""", author = """Robin S. Sharma""", year = 1996),
    Book(id = 16690, title = """The Moon is a Harsh Mistress""", author = """Robert A. Heinlein""", year = 1966),
    Book(id = 6138, title = """The Moonstone""", author = """Wilkie Collins""", year = 1868),
    Book(id = 100365, title = """The Mote in God's Eye (Moties, #1)""", author = """Larry Niven""", year = 1974),
    Book(
      id = 1904149,
      title = """The Mythical Man Month and Other Essays on Software Engineering""",
      author = """Frederick P. Brooks Jr.""",
      year = 1975
    ),
    Book(id = 16078221, title = """The Ocean at the End of the Lane""", author = """Neil Gaiman""", year = 2013),
    Book(id = 1196110, title = """The Old Curiosity Shop""", author = """Charles Dickens""", year = 1840),
    Book(
      id = 17255186,
      title = """The Phoenix Project: A Novel About IT, DevOps, and Helping Your Business Win""",
      author = """Gene Kim""",
      year = 2013
    ),
    Book(id = 95643, title = """The Places in Between""", author = """Rory Stewart""", year = 2004),
    Book(
      id = 17248798,
      title = """The Power of Habit: Why We Do What We Do and How to Change""",
      author = """Charles Duhigg""",
      year = 2012
    ),
    Book(id = 68984, title = """The Power of Your Subconscious Mind""", author = """Joseph Murphy""", year = 1963),
    Book(id = 3289938, title = """The Ragman's Son""", author = """Kirk Douglas""", year = 1988),
    Book(id = 22836957, title = """The Revenant""", author = """Michael Punke""", year = 2002),
    Book(id = 434903, title = """The Rings of Saturn""", author = """W.G. Sebald""", year = 1995),
    Book(id = 7242434, title = """The Rising Storm (Roger Brook, #3)""", author = """Dennis Wheatley""", year = 1949),
    Book(id = 603461, title = """The River of Doubt""", author = """Candice Millard""", year = 2005),
    Book(
      id = 171242,
      title = """The Roads to Sata: A 2000-Mile Walk Through Japan""",
      author = """Alan Booth""",
      year = 1985
    ),
    Book(
      id = 252453,
      title = """The Royal Road to Romance: Travelers' Tales Classics""",
      author = """Richard Halliburton""",
      year = 1925
    ),
    Book(
      id = 26140640,
      title = """The Rules of Life: A personal code for living a better, happier, more successful kind of life""",
      author = """Richard Templar""",
      year = 2005
    ),
    Book(id = 102534, title = """The Sagas of Icelanders""", author = """Jane Smiley""", year = 1200),
    Book(
      id = 23020954,
      title = """The Saint-Fiacre Affair (Maigret, #14)""",
      author = """Georges Simenon""",
      year = 1932
    ),
    Book(id = 12296, title = """The Scarlet Letter""", author = """Nathaniel Hawthorne""", year = 1850),
    Book(
      id = 487182,
      title = """The Science of Getting Rich: Attracting Financial Success through Creative Thought""",
      author = """Wallace D. Wattles""",
      year = 1910
    ),
    Book(id = 9108851, title = """The sea and the jungle""", author = """H.M. Tomlinson""", year = 1912),
    Book(
      id = 16247691,
      title = """The Shadow of Tyburn Tree (Roger Brook, #2)""",
      author = """Dennis Wheatley""",
      year = 1948
    ),
    Book(id = 7303877, title = """The Ship of Fools""", author = """Sebastian Brant""", year = 1494),
    Book(id = 4982, title = """The Sirens of Titan""", author = """Kurt Vonnegut Jr.""", year = 1959),
    Book(id = 12413859, title = """The Sisters Brothers""", author = """Patrick deWitt""", year = 2011),
    Book(id = 991990, title = """The Songs Of Distant Earth""", author = """Arthur C. Clarke""", year = 1986),
    Book(id = 1172884, title = """The Stand""", author = """Stephen King""", year = 1978),
    Book(id = 201449, title = """The Talisman""", author = """Stephen King""", year = 1984),
    Book(
      id = 15703260,
      title = """The Three Stigmata of Palmer Eldritch""",
      author = """Philip K. Dick""",
      year = 1965
    ),
    Book(id = 2493, title = """The Time Machine""", author = """H.G. Wells""", year = 1895),
    Book(
      id = 270416,
      title = """The Tragedy Of Tragedies Or The Life And Death Of Tom Thumb The Great""",
      author = """Henry Fielding""",
      year = 1731
    ),
    Book(id = 57658, title = """The Treasure of the Sierra Madre""", author = """B. Traven""", year = 1935),
    Book(id = 1419349, title = """The Ukimwi Road""", author = """Dervla Murphy""", year = 1994),
    Book(id = 112510, title = """The Vicar of Wakefield""", author = """Oliver Goldsmith""", year = 1766),
    Book(id = 32589, title = """The Wanderer""", author = """Knut Hamsun""", year = 1905),
    Book(id = 21115294, title = """The Wanderer (Condor Books)""", author = """Knut Hamsun""", year = 1905),
    Book(id = 3237399, title = """The Way of All Flesh""", author = """Samuel Butler""", year = 1903),
    Book(id = 238713, title = """The Wilderness World of John Muir""", author = """John Muir""", year = 1954),
    Book(id = 1081283, title = """The Wind in the Willows""", author = """Kenneth Grahame""", year = 1908),
    Book(id = 5890, title = """The Woman in White""", author = """Wilkie Collins""", year = 1859),
    Book(id = 52459921, title = """The Women at the Pump""", author = """Knut Hamsun""", year = 1920),
    Book(id = 341281, title = """The Woodlanders""", author = """Thomas Hardy""", year = 1887),
    Book(id = 24933757, title = """The Word for World is Forest""", author = """Ursula K. Le Guin""", year = 1972),
    Book(
      id = 733587,
      title =
        """The Works Of George Borrow: The Bible In Spain Or The Journeys Adventures And Imprisonments Of An Englishman In An Attempt To Circulate The Scriptures In The Peninsula V2""",
      author = """George Borrow""",
      year = 2006
    ),
    Book(id = 48503, title = """The Worst Journey in the World""", author = """Apsley Cherry-Garrard""", year = 1922),
    Book(id = 714887, title = """The Wrong Box""", author = """Robert Louis Stevenson""", year = 1889),
    Book(
      id = 19586131,
      title = """The Yellow Dog (Inspector Maigret #5)""",
      author = """Georges Simenon""",
      year = 1931
    ),
    Book(
      id = 18038824,
      title = """They Called Themselves The KKK""",
      author = """Susan Campbell Bartoletti""",
      year = 2010
    ),
    Book(id = 6616218, title = """They Found Atlantis (Lost World, #1)""", author = """Dennis Wheatley""", year = 1936),
    Book(id = 11468377, title = """Thinking, Fast and Slow""", author = """Daniel Kahneman""", year = 2011),
    Book(id = 296388, title = """Through Siberia by Accident""", author = """Dervla Murphy""", year = 2005),
    Book(
      id = 465704,
      title = """Through the Embers of Chaos: Balkan Journeys""",
      author = """Dervla Murphy""",
      year = 2002
    ),
    Book(id = 1419346, title = """Tibetan Foothold""", author = """Dervla Murphy""", year = 1966),
    Book(id = 4630, title = """To Have and Have Not""", author = """Ernest Hemingway""", year = 1937),
    Book(id = 2657, title = """To Kill a Mockingbird""", author = """Harper Lee""", year = 1960),
    Book(id = 10226283, title = """Together""", author = """Norman Douglas""", year = 1923),
    Book(
      id = 1108105,
      title = """Transylvania and Beyond: A Travel Memoir""",
      author = """Dervla Murphy""",
      year = 1992
    ),
    Book(id = 108854, title = """Travels into the Interior of Africa""", author = """Mungo Park""", year = 1799),
    Book(
      id = 8068273,
      title = """Travels with a Donkey in the Cevennes""",
      author = """Robert Louis Stevenson""",
      year = 1879
    ),
    Book(id = 862881, title = """Tristram Shandy""", author = """Laurence Sterne""", year = 1760),
    Book(id = 10435773, title = """True Grit""", author = """Charles Portis""", year = 1968),
    Book(id = 18300310, title = """True Grit""", author = """Bear Grylls""", year = 2013),
    Book(
      id = 33507,
      title = """Twenty Thousand Leagues Under the Sea (Extraordinary Voyages, #6)""",
      author = """Jules Verne""",
      year = 1869
    ),
    Book(id = 1282886, title = """Two Little Savages""", author = """Ernest Thompson Seton""", year = 1903),
    Book(
      id = 39090411,
      title = """Two Years Holiday or Adrift in the Pacific""",
      author = """Jules Verne""",
      year = 1888
    ),
    Book(id = 26331996, title = """Type-Driven Development with Idris""", author = """Edwin Brady""", year = 2017),
    Book(id = 22590, title = """Ubik""", author = """Philip K. Dick""", year = 1969),
    Book(
      id = 1382039,
      title = """UML Distilled: A Brief Guide to the Standard Object Modeling Language""",
      author = """Martin Fowler""",
      year = 1997
    ),
    Book(id = 41085118, title = """Unauthorized Bread""", author = """Cory Doctorow""", year = 2019),
    Book(
      id = 8664353,
      title = """Unbroken: A World War II Story of Survival, Resilience and Redemption""",
      author = """Laura Hillenbrand""",
      year = 2010
    ),
    Book(id = 46787, title = """Uncle Tom's Cabin""", author = """Harriet Beecher Stowe""", year = 1851),
    Book(
      id = 45546,
      title = """Undaunted Courage: The Pioneering First Mission to Explore America's Wild Frontier""",
      author = """Stephen E. Ambrose""",
      year = 1996
    ),
    Book(id = 25923630, title = """Undisturbed REST""", author = """Michael Stowe""", year = 2015),
    Book(id = 14566177, title = """Upon My Word""", author = """Pauline Hammant""", year = 2010),
    Book(
      id = 100247,
      title = """Vagabonding: An Uncommon Guide to the Art of Long-Term World Travel""",
      author = """Rolf Potts""",
      year = 2002
    ),
    Book(id = 5797, title = """Vanity Fair""", author = """William Makepeace Thackeray""", year = 1847),
    Book(id = 137235, title = """Victoria""", author = """Knut Hamsun""", year = 1898),
    Book(id = 21237715, title = """Victoria (Condor Books)""", author = """Knut Hamsun""", year = 1898),
    Book(id = 416201, title = """Visiting Rwanda""", author = """Dervla Murphy""", year = 1998),
    Book(
      id = 1116094,
      title = """Voices from Chernobyl: The Oral History of a Nuclear Disaster""",
      author = """Svetlana Alexievich""",
      year = 1997
    ),
    Book(id = 8108279, title = """Walden""", author = """Henry David Thoreau""", year = 1854),
    Book(
      id = 154881,
      title = """Walking with Spring: The Story That Inspired Thousands of Appalachian Trail Thru-Hikers""",
      author = """Earl V. Shaffer""",
      year = 1983
    ),
    Book(id = 967117, title = """Wayfarers""", author = """Knut Hamsun""", year = 1927),
    Book(id = 9411323, title = """We Die Alone""", author = """David Howarth""", year = 1954),
    Book(
      id = 242669,
      title = """We Die Alone: A WWII Epic of Escape and Endurance""",
      author = """David Howarth""",
      year = 1954
    ),
    Book(id = 15809301, title = """Westward Ho!""", author = """Charles Kingsley""", year = 1855),
    Book(id = 1108114, title = """Wheels Within Wheels: Autobiography""", author = """Dervla Murphy""", year = 1979),
    Book(id = 1950456, title = """Where the Indus is Young""", author = """Dervla Murphy""", year = 1978),
    Book(
      id = 289029,
      title = """Who Will Cry When You Die? Life Lessons from the Monk Who Sold His Ferrari""",
      author = """Robin S. Sharma""",
      year = 1999
    ),
    Book(id = 10185738, title = """Why Marx Was Right""", author = """Terry Eagleton""", year = 2011),
    Book(id = 11066750, title = """Wintersmith (Discworld, #35)""", author = """Terry Pratchett""", year = 2006),
    Book(id = 158141, title = """Wiseguy""", author = """Nicholas Pileggi""", year = 1985),
    Book(id = 17307614, title = """Wool (Silo #1)""", author = """Hugh Howey""", year = 2012),
    Book(
      id = 44919,
      title = """Working Effectively with Legacy Code""",
      author = """Michael C. Feathers""",
      year = 2004
    ),
    Book(
      id = 6116612,
      title = """Yes Prime Minister: The Diaries Of The Right Hon. James Hacker: Volume II""",
      author = """Jonathan Lynn""",
      year = 1986
    ),
    Book(
      id = 526193,
      title = """Yes, Prime Minister: The Diaries Of The Right Hon. James Hacker: Volume 1""",
      author = """Jonathan Lynn""",
      year = 1986
    ),
    Book(
      id = 2212686,
      title = """Young Stalin (Joseph Stalin, #1)""",
      author = """Simon Sebag Montefiore""",
      year = 2007
    ),
    Book(
      id = 894541,
      title = """Zen and the Art of Motorcycle Maintenance: An Inquiry into Values""",
      author = """Robert M. Pirsig""",
      year = 1974
    ),
    Book(
      id = 6656681,
      title = """Zones of Thought: A Fire Upon the Deep / A Deepness in the Sky""",
      author = """Vernor Vinge""",
      year = 2010
    )
  )

}
