CREATE SEQUENCE revision_seq START 1;
CREATE TABLE revision (
  revision_id BIGINT,
  created_timestamp TIMESTAMP
);