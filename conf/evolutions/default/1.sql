# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table citaentity (
  id                            bigint not null,
  diagnostico                   varchar(255),
  fecha                         bigint,
  medico_id                     bigint,
  paciente_id                   bigint,
  historial_id                  bigint,
  constraint pk_citaentity primary key (id)
);
create sequence Cita;

create table consejoentity (
  id                            bigint not null,
  mensaje                       varchar(255),
  fecha                         bigint,
  dieta                         varchar(255),
  actividad_fisica              varchar(255),
  medicamentos                  varchar(255),
  paciente_id                   bigint,
  medico_id                     bigint,
  constraint pk_consejoentity primary key (id)
);
create sequence Consejo;

create table emergenciaentity (
  id                            bigint not null,
  estado                        varchar(255),
  fecha                         bigint,
  ubicacion                     varchar(255),
  historial_id                  bigint,
  paciente_id                   bigint,
  constraint pk_emergenciaentity primary key (id)
);
create sequence Emergencia;

create table encriptado_entity (
  mensaje_codificado            varchar(255),
  hash_mensaje                  bytea,
  mensaje_desencriptado         varchar(255)
);

create table examenentity (
  id                            bigint not null,
  resultado                     varchar(255),
  fecha                         bigint,
  tipo                          varchar(255),
  paciente_id                   bigint,
  historial_id                  bigint,
  constraint pk_examenentity primary key (id)
);
create sequence Examen;

create table historialentity (
  id                            bigint not null,
  enfermedades                  varchar(255),
  alergias                      varchar(255),
  constraint pk_historialentity primary key (id)
);
create sequence Historial;

create table lecturaentity (
  id                            bigint not null,
  frecuencia_cardiaca           integer,
  fecha                         bigint,
  presion_sanguinea             integer,
  nivel_estres                  integer,
  estado                        integer,
  historial_id                  bigint,
  constraint pk_lecturaentity primary key (id)
);
create sequence Lectura;

create table marcapasosentity (
  id                            bigint not null,
  ritmo_cardiaco_marcapasos     integer,
  constraint pk_marcapasosentity primary key (id)
);
create sequence Marcapasos;

create table medicoentity (
  id                            bigint not null,
  nombre                        varchar(255),
  especialidad                  varchar(255),
  constraint pk_medicoentity primary key (id)
);
create sequence Medico;

create table pacienteentity (
  id                            bigint not null,
  nombre                        varchar(255),
  grupo_sanguineo               varchar(255),
  marcapasos_id                 bigint,
  historial_paciente_id         bigint,
  constraint uq_pacienteentity_marcapasos_id unique (marcapasos_id),
  constraint uq_pacienteentity_historial_paciente_id unique (historial_paciente_id),
  constraint pk_pacienteentity primary key (id)
);
create sequence Paciente;

create table pacienteentity_medicoentity (
  pacienteentity_id             bigint not null,
  medicoentity_id               bigint not null,
  constraint pk_pacienteentity_medicoentity primary key (pacienteentity_id,medicoentity_id)
);

create table userentity (
  id                            bigint not null,
  login                         varchar(255),
  password                      varchar(255),
  token                         varchar(255),
  permiso                       varchar(255),
  constraint pk_userentity primary key (id)
);
create sequence User;

alter table citaentity add constraint fk_citaentity_medico_id foreign key (medico_id) references medicoentity (id) on delete restrict on update restrict;
create index ix_citaentity_medico_id on citaentity (medico_id);

alter table citaentity add constraint fk_citaentity_paciente_id foreign key (paciente_id) references pacienteentity (id) on delete restrict on update restrict;
create index ix_citaentity_paciente_id on citaentity (paciente_id);

alter table citaentity add constraint fk_citaentity_historial_id foreign key (historial_id) references historialentity (id) on delete restrict on update restrict;
create index ix_citaentity_historial_id on citaentity (historial_id);

alter table consejoentity add constraint fk_consejoentity_paciente_id foreign key (paciente_id) references pacienteentity (id) on delete restrict on update restrict;
create index ix_consejoentity_paciente_id on consejoentity (paciente_id);

alter table consejoentity add constraint fk_consejoentity_medico_id foreign key (medico_id) references medicoentity (id) on delete restrict on update restrict;
create index ix_consejoentity_medico_id on consejoentity (medico_id);

alter table emergenciaentity add constraint fk_emergenciaentity_historial_id foreign key (historial_id) references historialentity (id) on delete restrict on update restrict;
create index ix_emergenciaentity_historial_id on emergenciaentity (historial_id);

alter table emergenciaentity add constraint fk_emergenciaentity_paciente_id foreign key (paciente_id) references pacienteentity (id) on delete restrict on update restrict;
create index ix_emergenciaentity_paciente_id on emergenciaentity (paciente_id);

alter table examenentity add constraint fk_examenentity_paciente_id foreign key (paciente_id) references pacienteentity (id) on delete restrict on update restrict;
create index ix_examenentity_paciente_id on examenentity (paciente_id);

alter table examenentity add constraint fk_examenentity_historial_id foreign key (historial_id) references historialentity (id) on delete restrict on update restrict;
create index ix_examenentity_historial_id on examenentity (historial_id);

alter table lecturaentity add constraint fk_lecturaentity_historial_id foreign key (historial_id) references historialentity (id) on delete restrict on update restrict;
create index ix_lecturaentity_historial_id on lecturaentity (historial_id);

alter table pacienteentity add constraint fk_pacienteentity_marcapasos_id foreign key (marcapasos_id) references marcapasosentity (id) on delete restrict on update restrict;

alter table pacienteentity add constraint fk_pacienteentity_historial_paciente_id foreign key (historial_paciente_id) references historialentity (id) on delete restrict on update restrict;

alter table pacienteentity_medicoentity add constraint fk_pacienteentity_medicoentity_pacienteentity foreign key (pacienteentity_id) references pacienteentity (id) on delete restrict on update restrict;
create index ix_pacienteentity_medicoentity_pacienteentity on pacienteentity_medicoentity (pacienteentity_id);

alter table pacienteentity_medicoentity add constraint fk_pacienteentity_medicoentity_medicoentity foreign key (medicoentity_id) references medicoentity (id) on delete restrict on update restrict;
create index ix_pacienteentity_medicoentity_medicoentity on pacienteentity_medicoentity (medicoentity_id);


# --- !Downs

alter table if exists citaentity drop constraint if exists fk_citaentity_medico_id;
drop index if exists ix_citaentity_medico_id;

alter table if exists citaentity drop constraint if exists fk_citaentity_paciente_id;
drop index if exists ix_citaentity_paciente_id;

alter table if exists citaentity drop constraint if exists fk_citaentity_historial_id;
drop index if exists ix_citaentity_historial_id;

alter table if exists consejoentity drop constraint if exists fk_consejoentity_paciente_id;
drop index if exists ix_consejoentity_paciente_id;

alter table if exists consejoentity drop constraint if exists fk_consejoentity_medico_id;
drop index if exists ix_consejoentity_medico_id;

alter table if exists emergenciaentity drop constraint if exists fk_emergenciaentity_historial_id;
drop index if exists ix_emergenciaentity_historial_id;

alter table if exists emergenciaentity drop constraint if exists fk_emergenciaentity_paciente_id;
drop index if exists ix_emergenciaentity_paciente_id;

alter table if exists examenentity drop constraint if exists fk_examenentity_paciente_id;
drop index if exists ix_examenentity_paciente_id;

alter table if exists examenentity drop constraint if exists fk_examenentity_historial_id;
drop index if exists ix_examenentity_historial_id;

alter table if exists lecturaentity drop constraint if exists fk_lecturaentity_historial_id;
drop index if exists ix_lecturaentity_historial_id;

alter table if exists pacienteentity drop constraint if exists fk_pacienteentity_marcapasos_id;

alter table if exists pacienteentity drop constraint if exists fk_pacienteentity_historial_paciente_id;

alter table if exists pacienteentity_medicoentity drop constraint if exists fk_pacienteentity_medicoentity_pacienteentity;
drop index if exists ix_pacienteentity_medicoentity_pacienteentity;

alter table if exists pacienteentity_medicoentity drop constraint if exists fk_pacienteentity_medicoentity_medicoentity;
drop index if exists ix_pacienteentity_medicoentity_medicoentity;

drop table if exists citaentity cascade;
drop sequence if exists Cita;

drop table if exists consejoentity cascade;
drop sequence if exists Consejo;

drop table if exists emergenciaentity cascade;
drop sequence if exists Emergencia;

drop table if exists encriptado_entity cascade;

drop table if exists examenentity cascade;
drop sequence if exists Examen;

drop table if exists historialentity cascade;
drop sequence if exists Historial;

drop table if exists lecturaentity cascade;
drop sequence if exists Lectura;

drop table if exists marcapasosentity cascade;
drop sequence if exists Marcapasos;

drop table if exists medicoentity cascade;
drop sequence if exists Medico;

drop table if exists pacienteentity cascade;
drop sequence if exists Paciente;

drop table if exists pacienteentity_medicoentity cascade;

drop table if exists userentity cascade;
drop sequence if exists User;

