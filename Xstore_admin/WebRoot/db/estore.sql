SELECT g.name, oi.gid, sum(oi.buynum) hot FROM orderitems oi, goods g WHERE oi.gid=g.id GROUP BY oi.gid ORDER BY hot DESC;