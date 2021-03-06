INSERT INTO USERS (ID,NAME,EMAIL) VALUES (1,'A','a@mail.com');
INSERT INTO USERS (ID,NAME,EMAIL) VALUES (2,'B','b@mail.com');
INSERT INTO USERS (ID,NAME,EMAIL) VALUES (3,'C','c@mail.com');

INSERT INTO SITE (ID,NAME,ADDRESSID) VALUES (1,'Roque de los Muchachos ',1);
INSERT INTO SITE (ID,NAME,ADDRESSID) VALUES (2,'Mc Donald Observatory',2);
INSERT INTO SITE (ID,NAME,ADDRESSID) VALUES (3,'Mauna Kea',3);
INSERT INTO SITE (ID,NAME,ADDRESSID) VALUES (4,'Sutherland',4);
INSERT INTO SITE (ID,NAME,ADDRESSID) VALUES (5,'Mount Graham',5);
INSERT INTO SITE (ID,NAME,ADDRESSID) VALUES (6,'Mount Paranal',6);
INSERT INTO SITE (ID,NAME,ADDRESSID) VALUES (7,'Cerro Pachon',7);

INSERT INTO SITE (ID,NAME,ADDRESSID) VALUES (8,'Serro-Tololo',1);
INSERT INTO SITE (ID,NAME,ADDRESSID) VALUES (9,'Atacama',1);

INSERT INTO ADDRESS (ID,COUNTRY,CITY,STREET,WEB,LATITUDE,LONGITUDE)
VALUES (1,'Spain','La Palma','Roque de los Muchachos','www.iac.es',28.763611111111111,-17.894722222222221);
INSERT INTO ADDRESS (ID,COUNTRY,CITY,STREET, WEB,LATITUDE,LONGITUDE)
VALUES (2,'USA','Jeff Davis County, Texas','McDonald Observatory','mcdonaldobservatory.org',30.671388888888892,104.021944444444443);
INSERT INTO ADDRESS (ID,COUNTRY,CITY,STREET,WEB,LATITUDE,LONGITUDE)
VALUES (3,'USA','Hawaii','Mauna Kea','',19.822222222222223,155.474999999999994);
INSERT INTO ADDRESS (ID,COUNTRY,CITY,STREET,WEB,LATITUDE,LONGITUDE)
VALUES (4,'South Africa','Northern Cape','South African Astronomical Observatory','www.saao.ac.za',-32.3783,-20.8105);
INSERT INTO ADDRESS (ID,COUNTRY,CITY,STREET, WEB,LATITUDE,LONGITUDE)
VALUES (5,'USA','Mount Graham, Arizona','Steward Observatory','mgio.arizona.edu',32.701388888888893,109.891944444444448);
INSERT INTO ADDRESS (ID,COUNTRY,CITY,STREET, WEB,LATITUDE,LONGITUDE)
VALUES (6,'Chile','Antofagasta Region','Paranal Observatory','eso.org/sci/facilities/paranal.html',-24.627222222222223,70.404166666666669);
INSERT INTO ADDRESS (ID,COUNTRY,CITY,STREET, WEB,LATITUDE,LONGITUDE)
VALUES (7,'Chile','Coquimbo Region','Cerro Pachón','www.gemini.edu',-30.24073,70.73659);



INSERT INTO ADDRESS (ID,COUNTRY,CITY,STREET, HOUSE,ZIP,PHONE,EMAIL,WEB,LATITUDE,LONGITUDE)
          VALUES (100,'Germany','Landsberg-am-Lech','Otto-Lilienthal-Str.','9','86899','+498191940490','en@omegon.eu','http://www.omegon.eu',0,0);

INSERT INTO MANUFACTURER (ID,NAME,ADDRESSID) VALUES (1,'Professional',1);
INSERT INTO MANUFACTURER (ID,NAME,ADDRESSID) VALUES (2,'Syntha',2);
INSERT INTO MANUFACTURER (ID,NAME,ADDRESSID) VALUES (3,'Meade',3);
INSERT INTO MANUFACTURER (ID,NAME,ADDRESSID) VALUES (4,'Omegon',1);

INSERT INTO BRAND (ID,NAME,MANUFACTURERID) VALUES (1,'',1);
INSERT INTO BRAND (ID,NAME,MANUFACTURERID) VALUES (2,'Celestron',2);
INSERT INTO BRAND (ID,NAME,MANUFACTURERID) VALUES (3,'SkyWatcher',2);
INSERT INTO BRAND (ID,NAME,MANUFACTURERID) VALUES (4,'Meade',3);
INSERT INTO BRAND (ID,NAME,MANUFACTURERID) VALUES (5,'Omegon',4);
INSERT INTO BRAND (ID,NAME,MANUFACTURERID) VALUES (6,'Vixen',4);
INSERT INTO BRAND (ID,NAME,MANUFACTURERID) VALUES (7,'Orion',5);
INSERT INTO BRAND (ID,NAME,MANUFACTURERID) VALUES (8,'Bresser',6);
INSERT INTO BRAND (ID,NAME,MANUFACTURERID) VALUES (9,'GSO',7);
INSERT INTO BRAND (ID,NAME,MANUFACTURERID) VALUES (10,'William Optics',8);

INSERT INTO DISTRIBUTOR (ID,NAME,ADDRESSID) VALUES (1,'Amazon',1);
INSERT INTO DISTRIBUTOR (ID,NAME,ADDRESSID) VALUES (2,'astroshop.eu',1);

INSERT INTO CURRENCY (ID,NAME,SHORTNAME) VALUES (1,'US Dollar','USD');
INSERT INTO CURRENCY (ID,NAME,SHORTNAME) VALUES (2,'Euro','EUR');
INSERT INTO CURRENCY (ID,NAME,SHORTNAME) VALUES (3,'Pound','GBP');

INSERT INTO PRICE (ID,PRODUCTID,DISTRIBUTORID,CURRENCYID,PRICE) VALUES (1,1,1,1,109.5);

INSERT INTO OPTICALSYSTEM (ID,NAME) VALUES (0,'Not defined');
INSERT INTO OPTICALSYSTEM (ID,NAME) VALUES (1,'Achromat');
INSERT INTO OPTICALSYSTEM (ID,NAME) VALUES (2,'Apochromat');
INSERT INTO OPTICALSYSTEM (ID,NAME) VALUES (3,'Newton');
INSERT INTO OPTICALSYSTEM (ID,NAME) VALUES (4,'Maksutov');
INSERT INTO OPTICALSYSTEM (ID,NAME) VALUES (5,'Maksutov-Newton');
INSERT INTO OPTICALSYSTEM (ID,NAME) VALUES (6,'Schmidt-Cassegrain');
INSERT INTO OPTICALSYSTEM (ID,NAME) VALUES (7,'Maksutov-Cassegrain');
INSERT INTO OPTICALSYSTEM (ID,NAME) VALUES (8,'Ritchey-Chretien');
INSERT INTO OPTICALSYSTEM (ID,NAME) VALUES (9,'Solar');
INSERT INTO OPTICALSYSTEM (ID,NAME) VALUES (10,'Rowe-Ackermann-Schmidt');
INSERT INTO OPTICALSYSTEM (ID,NAME) VALUES (11,'EdgeHD');

INSERT INTO MOUNTTYPE (ID,NAME) VALUES (0,'Not defined');
INSERT INTO MOUNTTYPE (ID,NAME) VALUES (1,'Azimut');
INSERT INTO MOUNTTYPE (ID,NAME) VALUES (2,'Azimut Fork');
INSERT INTO MOUNTTYPE (ID,NAME) VALUES (3,'Dobson');
INSERT INTO MOUNTTYPE (ID,NAME) VALUES (4,'Equatorial German');
INSERT INTO MOUNTTYPE (ID,NAME) VALUES (5,'Equatorial Fork');

INSERT INTO CONTROL (ID,NAME) VALUES (1,'Control');

INSERT INTO MOUNT (ID,NAME,MOUNTTYPEID,CONTROLID) VALUES (1,'AZ',1,1);

INSERT INTO PRODUCTSTAT (ID,PRODUCTID,VIEWS) VALUES (1,1,0);

INSERT INTO BARREL (ID,NAME,DIAMETER_MM,DIAMETER_INCH) VALUES (1,'0.96',24.4,0.96);
INSERT INTO BARREL (ID,NAME,DIAMETER_MM,DIAMETER_INCH) VALUES (2,'1 1/4',32,1.25);
INSERT INTO BARREL (ID,NAME,DIAMETER_MM,DIAMETER_INCH) VALUES (3,'2',51,2);
