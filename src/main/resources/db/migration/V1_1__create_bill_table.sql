CREATE TABLE bill (
  id UUID PRIMARY KEY,
  name VARCHAR(255),
  amount DECIMAL,
  start_date DATE,
  end_date DATE
);

CREATE TABLE bill_aud (
  rev bigint PRIMARY KEY,
  revtype INTEGER,
  id UUID,
  name VARCHAR(255),
  amount DECIMAL,
  start_date DATE,
  end_date DATE
);