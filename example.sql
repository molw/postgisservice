select distinct(common_name), COUNT(common_name) as counts, min(observation_start), max(observation_start), max(observation_start) -  min(observation_start) as range from birdobs group by common_name order by counts desc;

select common_name, ST_asText(location), observation_start, last_name from birdobs where common_name = 'Leach''s Storm-Petrel' order by observation_start;


select distinct(observer_id), COUNT(observer_id) as counts, min(observation_start), max(observation_start), max(observation_start) -  min(observation_start) as range  from birdobs group by observer_id order by counts;

select common_name, observer_id, st_asText(location), observation_start, observation_count, species_comments from birdobs where common_name = 'Pomarine Jaeger'; 

select count(observation_start), extract(year from observation_start) from birdobs group by extract(year from observation_start)order by extract(year from observation_start)

select count(observation_start) as Observations, count(distinct(observer_id)) as Observers, sum(duration_minutes) as "Total Observation Time", extract(year from observation_start) as Year from birdobs group by extract(year from observation_start) order by extract(year from observation_start);


