# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table calificacionentity (
  id                            bigint not null,
  tipo                          varchar(255),
  fecha                         bigint,
  valor                         float,
  calificado_id                 bigint,
  constraint pk_calificacionentity primary key (id)
);
create sequence Calificacion;

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

create table comentarioentity (
  id                            bigint not null,
  texto                         varchar(255),
  fecha                         bigint,
  comentado_id                  bigint,
  autor_id                      bigint,
  constraint pk_comentarioentity primary key (id)
);
create sequence Comentario;

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
  constraint pk_emergenciaentity primary key (id)
);
create sequence Emergencia;

create table estudianteentity (
  id                            bigint not null,
  nombre                        varchar(255),
  clave                         varchar(255),
  descripcion                   varchar(255),
  correo                        varchar(255),
  monitor                       boolean,
  precio_hora                   float,
  monithor_id                   bigint,
  constraint pk_estudianteentity primary key (id)
);
create sequence Estudiante;

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
  paciente_id                   bigint,
  historial_id                  bigint,
  constraint pk_lecturaentity primary key (id)
);
create sequence Lectura;

create table marcapasosentity (
  id                            bigint not null,
  ritmo_cardiaco                integer,
  constraint pk_marcapasosentity primary key (id)
);
create sequence Marcapasos;

create table materiaentity (
  id                            bigint not null,
  nombre                        varchar(255),
  codigo                        varchar(255),
  descripcion                   varchar(255),
  constraint pk_materiaentity primary key (id)
);
create sequence Materia;

create table materiaentity_estudianteentity (
  materiaentity_id              bigint not null,
  estudianteentity_id           bigint not null,
  constraint pk_materiaentity_estudianteentity primary key (materiaentity_id,estudianteentity_id)
);

create table medicoentity (
  id                            bigint not null,
  nombre                        varchar(255),
  especialidad                  varchar(255),
  constraint pk_medicoentity primary key (id)
);
create sequence Medico;

create table monithorentity (
  id                            bigint not null,
  constraint pk_monithorentity primary key (id)
);
create sequence Monithor;

create table monitoriaentity (
  id                            bigint not null,
  fecha_inicial                 bigint,
  fecha_final                   bigint,
  descripcion                   varchar(255),
  precio                        float,
  cupos                         integer,
  estado                        integer,
  lugar                         varchar(255),
  materia_id                    bigint,
  tutor_id                      bigint,
  constraint pk_monitoriaentity primary key (id)
);
create sequence Monitoria;

create table monitoriaentity_estudianteentity (
  monitoriaentity_id            bigint not null,
  estudianteentity_id           bigint not null,
  constraint pk_monitoriaentity_estudianteentity primary key (monitoriaentity_id,estudianteentity_id)
);

create table notificacionentity (
  id                            bigint not null,
  texto                         varchar(255),
  fecha                         bigint,
  entregada                     boolean,
  notificado_id                 bigint,
  constraint pk_notificacionentity primary key (id)
);
create sequence Notificacion;

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

alter table calificacionentity add constraint fk_calificacionentity_calificado_id foreign key (calificado_id) references estudianteentity (id) on delete restrict on update restrict;
create index ix_calificacionentity_calificado_id on calificacionentity (calificado_id);

alter table citaentity add constraint fk_citaentity_medico_id foreign key (medico_id) references medicoentity (id) on delete restrict on update restrict;
create index ix_citaentity_medico_id on citaentity (medico_id);

alter table citaentity add constraint fk_citaentity_paciente_id foreign key (paciente_id) references pacienteentity (id) on delete restrict on update restrict;
create index ix_citaentity_paciente_id on citaentity (paciente_id);

alter table citaentity add constraint fk_citaentity_historial_id foreign key (historial_id) references historialentity (id) on delete restrict on update restrict;
create index ix_citaentity_historial_id on citaentity (historial_id);

alter table comentarioentity add constraint fk_comentarioentity_comentado_id foreign key (comentado_id) references estudianteentity (id) on delete restrict on update restrict;
create index ix_comentarioentity_comentado_id on comentarioentity (comentado_id);

alter table comentarioentity add constraint fk_comentarioentity_autor_id foreign key (autor_id) references estudianteentity (id) on delete restrict on update restrict;
create index ix_comentarioentity_autor_id on comentarioentity (autor_id);

alter table consejoentity add constraint fk_consejoentity_paciente_id foreign key (paciente_id) references pacienteentity (id) on delete restrict on update restrict;
create index ix_consejoentity_paciente_id on consejoentity (paciente_id);

alter table consejoentity add constraint fk_consejoentity_medico_id foreign key (medico_id) references medicoentity (id) on delete restrict on update restrict;
create index ix_consejoentity_medico_id on consejoentity (medico_id);

alter table emergenciaentity add constraint fk_emergenciaentity_historial_id foreign key (historial_id) references historialentity (id) on delete restrict on update restrict;
create index ix_emergenciaentity_historial_id on emergenciaentity (historial_id);

alter table estudianteentity add constraint fk_estudianteentity_monithor_id foreign key (monithor_id) references monithorentity (id) on delete restrict on update restrict;
create index ix_estudianteentity_monithor_id on estudianteentity (monithor_id);

alter table examenentity add constraint fk_examenentity_paciente_id foreign key (paciente_id) references pacienteentity (id) on delete restrict on update restrict;
create index ix_examenentity_paciente_id on examenentity (paciente_id);

alter table examenentity add constraint fk_examenentity_historial_id foreign key (historial_id) references historialentity (id) on delete restrict on update restrict;
create index ix_examenentity_historial_id on examenentity (historial_id);

alter table lecturaentity add constraint fk_lecturaentity_paciente_id foreign key (paciente_id) references pacienteentity (id) on delete restrict on update restrict;
create index ix_lecturaentity_paciente_id on lecturaentity (paciente_id);

alter table lecturaentity add constraint fk_lecturaentity_historial_id foreign key (historial_id) references historialentity (id) on delete restrict on update restrict;
create index ix_lecturaentity_historial_id on lecturaentity (historial_id);

alter table materiaentity_estudianteentity add constraint fk_materiaentity_estudianteentity_materiaentity foreign key (materiaentity_id) references materiaentity (id) on delete restrict on update restrict;
create index ix_materiaentity_estudianteentity_materiaentity on materiaentity_estudianteentity (materiaentity_id);

alter table materiaentity_estudianteentity add constraint fk_materiaentity_estudianteentity_estudianteentity foreign key (estudianteentity_id) references estudianteentity (id) on delete restrict on update restrict;
create index ix_materiaentity_estudianteentity_estudianteentity on materiaentity_estudianteentity (estudianteentity_id);

alter table monitoriaentity add constraint fk_monitoriaentity_materia_id foreign key (materia_id) references materiaentity (id) on delete restrict on update restrict;
create index ix_monitoriaentity_materia_id on monitoriaentity (materia_id);

alter table monitoriaentity add constraint fk_monitoriaentity_tutor_id foreign key (tutor_id) references estudianteentity (id) on delete restrict on update restrict;
create index ix_monitoriaentity_tutor_id on monitoriaentity (tutor_id);

alter table monitoriaentity_estudianteentity add constraint fk_monitoriaentity_estudianteentity_monitoriaentity foreign key (monitoriaentity_id) references monitoriaentity (id) on delete restrict on update restrict;
create index ix_monitoriaentity_estudianteentity_monitoriaentity on monitoriaentity_estudianteentity (monitoriaentity_id);

alter table monitoriaentity_estudianteentity add constraint fk_monitoriaentity_estudianteentity_estudianteentity foreign key (estudianteentity_id) references estudianteentity (id) on delete restrict on update restrict;
create index ix_monitoriaentity_estudianteentity_estudianteentity on monitoriaentity_estudianteentity (estudianteentity_id);

alter table notificacionentity add constraint fk_notificacionentity_notificado_id foreign key (notificado_id) references estudianteentity (id) on delete restrict on update restrict;
create index ix_notificacionentity_notificado_id on notificacionentity (notificado_id);

alter table pacienteentity add constraint fk_pacienteentity_marcapasos_id foreign key (marcapasos_id) references marcapasosentity (id) on delete restrict on update restrict;

alter table pacienteentity add constraint fk_pacienteentity_historial_paciente_id foreign key (historial_paciente_id) references historialentity (id) on delete restrict on update restrict;

alter table pacienteentity_medicoentity add constraint fk_pacienteentity_medicoentity_pacienteentity foreign key (pacienteentity_id) references pacienteentity (id) on delete restrict on update restrict;
create index ix_pacienteentity_medicoentity_pacienteentity on pacienteentity_medicoentity (pacienteentity_id);

alter table pacienteentity_medicoentity add constraint fk_pacienteentity_medicoentity_medicoentity foreign key (medicoentity_id) references medicoentity (id) on delete restrict on update restrict;
create index ix_pacienteentity_medicoentity_medicoentity on pacienteentity_medicoentity (medicoentity_id);


# --- !Downs

alter table if exists calificacionentity drop constraint if exists fk_calificacionentity_calificado_id;
drop index if exists ix_calificacionentity_calificado_id;

alter table if exists citaentity drop constraint if exists fk_citaentity_medico_id;
drop index if exists ix_citaentity_medico_id;

alter table if exists citaentity drop constraint if exists fk_citaentity_paciente_id;
drop index if exists ix_citaentity_paciente_id;

alter table if exists citaentity drop constraint if exists fk_citaentity_historial_id;
drop index if exists ix_citaentity_historial_id;

alter table if exists comentarioentity drop constraint if exists fk_comentarioentity_comentado_id;
drop index if exists ix_comentarioentity_comentado_id;

alter table if exists comentarioentity drop constraint if exists fk_comentarioentity_autor_id;
drop index if exists ix_comentarioentity_autor_id;

alter table if exists consejoentity drop constraint if exists fk_consejoentity_paciente_id;
drop index if exists ix_consejoentity_paciente_id;

alter table if exists consejoentity drop constraint if exists fk_consejoentity_medico_id;
drop index if exists ix_consejoentity_medico_id;

alter table if exists emergenciaentity drop constraint if exists fk_emergenciaentity_historial_id;
drop index if exists ix_emergenciaentity_historial_id;

alter table if exists estudianteentity drop constraint if exists fk_estudianteentity_monithor_id;
drop index if exists ix_estudianteentity_monithor_id;

alter table if exists examenentity drop constraint if exists fk_examenentity_paciente_id;
drop index if exists ix_examenentity_paciente_id;

alter table if exists examenentity drop constraint if exists fk_examenentity_historial_id;
drop index if exists ix_examenentity_historial_id;

alter table if exists lecturaentity drop constraint if exists fk_lecturaentity_paciente_id;
drop index if exists ix_lecturaentity_paciente_id;

alter table if exists lecturaentity drop constraint if exists fk_lecturaentity_historial_id;
drop index if exists ix_lecturaentity_historial_id;

alter table if exists materiaentity_estudianteentity drop constraint if exists fk_materiaentity_estudianteentity_materiaentity;
drop index if exists ix_materiaentity_estudianteentity_materiaentity;

alter table if exists materiaentity_estudianteentity drop constraint if exists fk_materiaentity_estudianteentity_estudianteentity;
drop index if exists ix_materiaentity_estudianteentity_estudianteentity;

alter table if exists monitoriaentity drop constraint if exists fk_monitoriaentity_materia_id;
drop index if exists ix_monitoriaentity_materia_id;

alter table if exists monitoriaentity drop constraint if exists fk_monitoriaentity_tutor_id;
drop index if exists ix_monitoriaentity_tutor_id;

alter table if exists monitoriaentity_estudianteentity drop constraint if exists fk_monitoriaentity_estudianteentity_monitoriaentity;
drop index if exists ix_monitoriaentity_estudianteentity_monitoriaentity;

alter table if exists monitoriaentity_estudianteentity drop constraint if exists fk_monitoriaentity_estudianteentity_estudianteentity;
drop index if exists ix_monitoriaentity_estudianteentity_estudianteentity;

alter table if exists notificacionentity drop constraint if exists fk_notificacionentity_notificado_id;
drop index if exists ix_notificacionentity_notificado_id;

alter table if exists pacienteentity drop constraint if exists fk_pacienteentity_marcapasos_id;

alter table if exists pacienteentity drop constraint if exists fk_pacienteentity_historial_paciente_id;

alter table if exists pacienteentity_medicoentity drop constraint if exists fk_pacienteentity_medicoentity_pacienteentity;
drop index if exists ix_pacienteentity_medicoentity_pacienteentity;

alter table if exists pacienteentity_medicoentity drop constraint if exists fk_pacienteentity_medicoentity_medicoentity;
drop index if exists ix_pacienteentity_medicoentity_medicoentity;

drop table if exists calificacionentity cascade;
drop sequence if exists Calificacion;

drop table if exists citaentity cascade;
drop sequence if exists Cita;

drop table if exists comentarioentity cascade;
drop sequence if exists Comentario;

drop table if exists consejoentity cascade;
drop sequence if exists Consejo;

drop table if exists emergenciaentity cascade;
drop sequence if exists Emergencia;

drop table if exists estudianteentity cascade;
drop sequence if exists Estudiante;

drop table if exists examenentity cascade;
drop sequence if exists Examen;

drop table if exists historialentity cascade;
drop sequence if exists Historial;

drop table if exists lecturaentity cascade;
drop sequence if exists Lectura;

drop table if exists marcapasosentity cascade;
drop sequence if exists Marcapasos;

drop table if exists materiaentity cascade;
drop sequence if exists Materia;

drop table if exists materiaentity_estudianteentity cascade;

drop table if exists medicoentity cascade;
drop sequence if exists Medico;

drop table if exists monithorentity cascade;
drop sequence if exists Monithor;

drop table if exists monitoriaentity cascade;
drop sequence if exists Monitoria;

drop table if exists monitoriaentity_estudianteentity cascade;

drop table if exists notificacionentity cascade;
drop sequence if exists Notificacion;

drop table if exists pacienteentity cascade;
drop sequence if exists Paciente;

drop table if exists pacienteentity_medicoentity cascade;

