package Utils

object Consts {

  // Pre-define k for each monitoring station in each temporal scale
  val kHourlyMap = Map(
    "Central LA CO"-> 9,
    "W San Gabriel Vly" -> 9,
    "San Gabriel Mts" -> 9,
    "SW San Bernardino" -> 9,
    "W San Fernando Vly" -> 10,
    "E San Fernando Vly" -> 10,
    "E San Gabriel V-2" -> 10,
    "E San Gabriel V-1" -> 10,
    "NW Coastal LA" -> 10,
    "Santa Clarita Vly" -> 9,
    "SW Coastal LA" -> 10,
    "South Coastal LA" -> 10,
    "Southeast LA CO" -> 9,
    "Antelope Vly" -> 9)


  val airnow_reporting_area_geofeature_tablename = Map(
    "landuse_a" -> "geo_features.airnow_reporting_areas_geofeature_landuse_a",
    "natural" -> "geo_features.airnow_reporting_areas_geofeature_natural",
    "natural_a" -> "geo_features.airnow_reporting_areas_geofeature_natural_a",
    "places" -> "geo_features.airnow_reporting_areas_geofeature_places",
    "places_a" -> "geo_features.airnow_reporting_areas_geofeature_places_a",
    "pofw" -> "geo_features.airnow_reporting_areas_geofeature_pofw_a",
    "pofw_a" ->"geo_features.airnow_reporting_areas_geofeature_pois",
    "pois" -> "geo_features.airnow_reporting_areas_geofeature_pofw",
    "pois_a" -> "geo_features.airnow_reporting_areas_geofeature_pois_a",
    "railways" -> "geo_features.airnow_reporting_areas_geofeature_railways",
    "roads" -> "geo_features.airnow_reporting_areas_geofeature_roads",
    "traffic" -> "geo_features.airnow_reporting_areas_geofeature_traffic_a",
    "traffic_a" -> "geo_features.airnow_reporting_areas_geofeature_transport",
    "transport" -> "geo_features.airnow_reporting_areas_geofeature_traffic",
    "transport_a" -> "geo_features.airnow_reporting_areas_geofeature_transport_a",
    "waterways" -> "geo_features.airnow_reporting_areas_geofeature_waterways",
    "water_a" -> "geo_features.airnow_reporting_areas_geofeature_water_a",
    "elevation" -> "geo_features.airnow_reporting_areas_elevation",
    "longitude" -> "geo_features.airnow_reporting_areas_elevation",
    "latitude" -> "geo_features.airnow_reporting_areas_elevation"
  )

  val la_fishnet_geofeature_tablename = Map(
    "landuse_a" -> "geo_features.la_fishnet_geofeature_landuse_a",
    "natural" -> "geo_features.la_fishnet_geofeature_natural",
    "natural_a" -> "geo_features.la_fishnet_geofeature_natural_a",
    "places" -> "geo_features.la_fishnet_geofeature_places",
    "places_a" -> "geo_features.la_fishnet_geofeature_places_a",
    "pofw" -> "geo_features.la_fishnet_geofeature_pofw",
    "pofw_a" -> "geo_features.la_fishnet_geofeature_pofw_a",
    "pois" -> "geo_features.la_fishnet_geofeature_pois",
    "pois_a" -> "geo_features.la_fishnet_geofeature_pois_a",
    "railways" -> "geo_features.la_fishnet_geofeature_railways",
    "roads" -> "geo_features.la_fishnet_geofeature_roads",
    "traffic" -> "geo_features.la_fishnet_geofeature_traffic",
    "traffic_a" -> "geo_features.la_fishnet_geofeature_traffic_a",
    "transport" -> "geo_features.la_fishnet_geofeature_transport",
    "transport_a" -> "geo_features.la_fishnet_geofeature_transport_a",
    "waterways" -> "geo_features.la_fishnet_geofeature_waterways",
    "water_a" -> "geo_features.la_fishnet_geofeature_water_a",
    "elevation" -> "geo_features.la_fishnet_elevation",
    "longitude" -> "geo_features.la_fishnet_elevation",
    "latitude" -> "geo_features.la_fishnet_elevation"
  )

  val purpleair_sensor_la_geofeature_tablename = Map(
    "landuse_a" -> "geo_features.purpleair_sensor_la_geofeature_landuse_a",
    "natural" -> "geo_features.purpleair_sensor_la_geofeature_natural",
    "natural_a" -> "geo_features.purpleair_sensor_la_geofeature_natural_a",
    "places" -> "geo_features.purpleair_sensor_la_geofeature_places",
    "places_a" -> "geo_features.purpleair_sensor_la_geofeature_places_a",
    "pofw" -> "geo_features.purpleair_sensor_la_geofeature_pofw",
    "pofw_a" -> "geo_features.purpleair_sensor_la_geofeature_pofw_a",
    "pois" -> "geo_features.purpleair_sensor_la_geofeature_pois",
    "pois_a" -> "geo_features.purpleair_sensor_la_geofeature_pois_a",
    "railways" -> "geo_features.purpleair_sensor_la_geofeature_railways",
    "roads" -> "geo_features.purpleair_sensor_la_geofeature_roads",
    "traffic" -> "geo_features.purpleair_sensor_la_geofeature_traffic",
    "traffic_a" -> "geo_features.purpleair_sensor_la_geofeature_traffic_a",
    "transport" -> "geo_features.purpleair_sensor_la_geofeature_transport",
    "transport_a" -> "geo_features.purpleair_sensor_la_geofeature_transport_a",
    "waterways" -> "geo_features.purpleair_sensor_la_geofeature_waterways",
    "water_a" -> "geo_features.purpleair_sensor_la_geofeature_water_a"
    //"elevation" -> "geo_features.purpleair_sensor_la_elevation",
    //"longitude" -> "geo_features.purpleair_sensor_la_elevation",
    //"latitude" -> "geo_features.purpleair_sensor_la_elevation"
  )

//  val los_angeles_geofeature_tablename = Map(
//    "aeroways" -> "los_angeles.los_angeles_sensor_geofeature_aeroways",
//    "buildings" -> "los_angeles.los_angeles_sensor_geofeature_buildings",
//    "landusages" -> "los_angeles.los_angeles_sensor_geofeature_landusages",
//    "ocean" -> "los_angeles.los_angeles_sensor_geofeature_ocean",
//    "roads" -> "los_angeles.los_angeles_sensor_geofeature_roads",
//    "waterareas" -> "los_angeles.los_angeles_sensor_geofeature_waterareas",
//    "longitude" -> "airnow_reporting_area_location",
//    "latitude" -> "airnow_reporting_area_location"
//  )
//
//  val los_angeles_fishnet_geofeature_tablename = Map(
//    "aeroways" -> "los_angeles.los_angeles_fishnet_geofeature_aeroways",
//    "buildings" -> "los_angeles.los_angeles_fishnet_geofeature_buildings",
//    "landusages" -> "los_angeles.los_angeles_fishnet_geofeature_landusages",
//    "ocean" -> "los_angeles.los_angeles_fishnet_geofeature_ocean",
//    "roads" -> "los_angeles.los_angeles_fishnet_geofeature_roads",
//    "waterareas" -> "los_angeles.los_angeles_fishnet_geofeature_waterareas",
//    "longitude" -> "airnow_reporting_area_location",
//    "latitude" -> "airnow_reporting_area_location"
//  )
}
