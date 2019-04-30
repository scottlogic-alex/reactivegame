USE firsttest;
UPDATE hats h
JOIN items i
  ON i.id = h.id
SET h.in_use = 0
WHERE i.user_id = :user_id

UPDATE Hat h
SET h.inUse = false
WHERE h.user.id = :user_id