CREATE TABLE IF NOT EXISTS cameras
(
    id         bigserial,
    name       varchar(255) NOT NULL,
    nasa_id    bigint       NOT NULL,
    created_at timestamp    NOT NULL default now(),

    constraint PK_cameras PRIMARY KEY (id),
    constraint UQ_cameras_nasa_id UNIQUE (nasa_id)
);

CREATE TABLE IF NOT EXISTS pictures
(
    id         bigserial,
    nasa_id    bigint       NOT NULL,
    camera_id  bigint       NOT NULL,
    img_src    varchar(255) NOT NULL,
    created_at timestamp    NOT NULL DEFAULT now(),

    constraint PK_pictures PRIMARY KEY (id),
    constraint FK_pictures_cameras FOREIGN KEY (camera_id) REFERENCES cameras (id)
)