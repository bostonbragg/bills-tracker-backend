CREATE TABLE due (
  bill_id UUID PRIMARY KEY,
  payment_frequency VARCHAR(255),
  day_of_the_week VARCHAR(255),
  date_of_the_month INTEGER,
  month_of_the_year INTEGER
);

CREATE TABLE due_aud (
  rev bigint PRIMARY KEY,
  revtype INTEGER,
  bill_id UUID,
  payment_frequency VARCHAR(255),
  day_of_the_week VARCHAR(255),
  date_of_the_month INTEGER,
  month_of_the_year INTEGER
);