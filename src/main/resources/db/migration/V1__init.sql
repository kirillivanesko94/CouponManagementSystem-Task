create table doctor (
id uuid primary key,
name text not null,
patient_id uuid not null
);

create table patient(
id uuid primary key,
name text not null,
date_of_birth date not null,
doctor_id uuid not null,

constraint fk_patient_doctor_id foreign key(doctor_id) references doctor(id) on delete restrict on update restrict
);

create table slot(
id uuid primary key,
time_start timestamp not null,
time_end timestamp not null,
doctor_id uuid not null,

constraint fk_slot_doctor_id foreign key(doctor_id) references doctor(id) on delete restrict on update restrict
);

create table ticket(
id uuid primary key,
slot_id uuid not null,
patient_id uuid not null,

constraint fk_ticket_slot_id foreign key(slot_id) references slot(id) on delete restrict on update restrict,
constraint fk_ticket_patient_id foreign key(patient_id) references patient(id) on delete restrict on update restrict
);

