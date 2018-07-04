DROP TABLE IF EXISTS "public"."user";
CREATE TABLE "public"."user" (
"id" int4 NOT NULL,
"email" varchar(255) COLLATE "default" NOT NULL,
"password" varchar(255) COLLATE "default" NOT NULL,
"username" varchar(255) COLLATE "default" NOT NULL,
"role" varchar(255) COLLATE "default" NOT NULL,
"status" int2 NOT NULL,
"regTime" timestamp(6) NOT NULL,
"regIp" varchar(255) COLLATE "default" NOT NULL
)WITH (OIDS=FALSE);

INSERT INTO "public"."user" VALUES ('1', 'zhangjianwei@dxy.cn', '123456', 'zhangjianwei', 'admin', '1', '2018-06-24 10:28:58', '192.168.100.110');
ALTER TABLE "public"."user" ADD PRIMARY KEY ("id");