-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 03-Ago-2016 às 00:34
-- Versão do servidor: 5.6.12-log
-- versão do PHP: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `comselog`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `estados`
--

CREATE TABLE IF NOT EXISTS `estados` (
  `cod_estados` int(11) NOT NULL AUTO_INCREMENT,
  `sigla` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `nome_est` varchar(72) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`cod_estados`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=28 ;

--
-- Extraindo dados da tabela `estados`
--

INSERT INTO `estados` (`cod_estados`, `sigla`, `nome_est`) VALUES
(1, 'AC', 'ACRE'),
(2, 'AL', 'ALAGOAS'),
(3, 'AP', 'AMAPÁ'),
(4, 'AM', 'AMAZONAS'),
(5, 'BA', 'BAHIA'),
(6, 'CE', 'CEARÁ'),
(7, 'DF', 'DISTRITO FEDERAL'),
(8, 'ES', 'ESPÍRITO SANTO'),
(9, 'RR', 'RORAIMA'),
(10, 'GO', 'GOIÁS'),
(11, 'MA', 'MARANHÃO'),
(12, 'MT', 'MATO GROSSO'),
(13, 'MS', 'MATO GROSSO DO SUL'),
(14, 'MG', 'MINAS GERAIS'),
(15, 'PA', 'PARÁ'),
(16, 'PB', 'PARAÍBA'),
(17, 'PR', 'PARANÁ'),
(18, 'PE', 'PERNAMBUCO'),
(19, 'PI', 'PIAUÍ'),
(20, 'RJ', 'RIO DE JANEIRO'),
(21, 'RN', 'RIO GRANDE DO NORTE'),
(22, 'RS', 'RIO GRANDE DO SUL'),
(23, 'RO', 'RONDÔNIA'),
(24, 'TO', 'TOCANTINS'),
(25, 'SC', 'SANTA CATARINA'),
(26, 'SP', 'SÃO PAULO'),
(27, 'SE', 'SERGIPE');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
