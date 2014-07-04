-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 04, 2014 at 06:12 AM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `f1telemetry`
--
CREATE DATABASE IF NOT EXISTS `f1telemetry` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `f1telemetry`;

-- --------------------------------------------------------

--
-- Table structure for table `lap`
--

CREATE TABLE IF NOT EXISTS `lap` (
  `lap_id` int(11) NOT NULL AUTO_INCREMENT,
  `lap_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `lap_averageSpeed` double NOT NULL,
  `lap_fuelConsuption` double NOT NULL,
  `lap_kersConsuption` double NOT NULL,
  `lap_drsTime` double NOT NULL,
  PRIMARY KEY (`lap_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

-- --------------------------------------------------------

--
-- Table structure for table `lapinfo`
--

CREATE TABLE IF NOT EXISTS `lapinfo` (
  `lapInfo_id` int(11) NOT NULL AUTO_INCREMENT,
  `lap_id` int(11) NOT NULL,
  `lapInfo_time` double DEFAULT NULL,
  `lapInfo_lapTime` double DEFAULT NULL,
  `lapInfo_lapDistance` double DEFAULT NULL,
  `lapInfo_distance` double DEFAULT NULL,
  `lapInfo_posX` double DEFAULT NULL,
  `lapInfo_posY` double DEFAULT NULL,
  `lapInfo_posZ` double DEFAULT NULL,
  `lapInfo_speed` double DEFAULT NULL,
  `lapInfo_posXV` double DEFAULT NULL,
  `lapInfo_posYV` double DEFAULT NULL,
  `lapInfo_posZV` double DEFAULT NULL,
  `lapInfo_posXR` double DEFAULT NULL,
  `lapInfo_roll` double DEFAULT NULL,
  `lapInfo_posZR` double DEFAULT NULL,
  `lapInfo_posXD` double DEFAULT NULL,
  `lapInfo_pitch` double DEFAULT NULL,
  `lapInfo_posZD` double DEFAULT NULL,
  `lapInfo_suspensionPositionRL` double DEFAULT NULL,
  `lapInfo_suspensionPositionRR` double DEFAULT NULL,
  `lapInfo_suspensionPositionFL` double DEFAULT NULL,
  `lapInfo_suspensionPositionFR` double DEFAULT NULL,
  `lapInfo_suspensionVelocityRL` double DEFAULT NULL,
  `lapInfo_suspensionVelocityRR` double DEFAULT NULL,
  `lapInfo_suspensionVelocityFL` double DEFAULT NULL,
  `lapInfo_suspensionVelocityFR` double DEFAULT NULL,
  `lapInfo_wheelSpeedRL` double DEFAULT NULL,
  `lapInfo_wheelSpeedRR` double DEFAULT NULL,
  `lapInfo_wheelSpeedFL` double DEFAULT NULL,
  `lapInfo_wheelSpeedFR` double DEFAULT NULL,
  `lapInfo_throttle` double DEFAULT NULL,
  `lapInfo_steer` double DEFAULT NULL,
  `lapInfo_brake` double DEFAULT NULL,
  `lapInfo_clutch` double DEFAULT NULL,
  `lapInfo_gear` double DEFAULT NULL,
  `lapInfo_gForceLatitudinal` double DEFAULT NULL,
  `lapInfo_gForceLongitudinal` double DEFAULT NULL,
  `lapInfo_lap` double DEFAULT NULL,
  `lapInfo_engineRpm` double DEFAULT NULL,
  `lapInfo_newField1` double DEFAULT NULL,
  `lapInfo_racePosition` double DEFAULT NULL,
  `lapInfo_KersRemaining` double DEFAULT NULL,
  `lapInfo_kersRecharge` double DEFAULT NULL,
  `lapInfo_drsStatus` double DEFAULT NULL,
  `lapInfo_difficulty` double DEFAULT NULL,
  `lapInfo_assists` double DEFAULT NULL,
  `lapInfo_fuelRemaining` double DEFAULT NULL,
  `lapInfo_sessionType` double DEFAULT NULL,
  `lapInfo_newField10` double DEFAULT NULL,
  `lapInfo_sector` double DEFAULT NULL,
  `lapInfo_timeSector1` double DEFAULT NULL,
  `lapInfo_timeSector2` double DEFAULT NULL,
  `lapInfo_bakeTemperatureRL` double DEFAULT NULL,
  `lapInfo_bakeTemperatureRR` double DEFAULT NULL,
  `lapInfo_bakeTemperatureFL` double DEFAULT NULL,
  `lapInfo_bakeTemperatureFR` double DEFAULT NULL,
  `lapInfo_newField18` double DEFAULT NULL,
  `lapInfo_newField19` double DEFAULT NULL,
  `lapInfo_newField20` double DEFAULT NULL,
  `lapInfo_newField21` double DEFAULT NULL,
  `lapInfo_completedLapsInRace` double DEFAULT NULL,
  `lapInfo_totalLapsInRace` double DEFAULT NULL,
  `lapInfo_PreviousLapTime` double DEFAULT NULL,
  `lapInfo_newField26` double DEFAULT NULL,
  `lapInfo_newField27` double DEFAULT NULL,
  `lapInfo_newField28` double DEFAULT NULL,
  PRIMARY KEY (`lapInfo_id`),
  KEY `lap_id` (`lap_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12081 ;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `lapinfo`
--
ALTER TABLE `lapinfo`
  ADD CONSTRAINT `a_lap_lapInfo` FOREIGN KEY (`lap_id`) REFERENCES `lap` (`lap_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
