module Foreign.Csv where

import Prelude

import Control.Promise (Promise, toAff)
import Effect (Effect)
import Effect.Class (liftEffect)
import Effect.Aff (Aff)

foreign import data ObjectCsvWriter :: Type

foreign import createObjectCsvWriter :: ObjectCsvWriterParams -> ObjectCsvWriter

type ObjectCsvWriterParams = { path :: String, header :: Array Header }
type Header = { id :: String, title :: String }

foreign import _writeRecords :: forall r. ObjectCsvWriter -> Array { | r} -> Effect (Promise Unit)

writeRecords :: forall r. ObjectCsvWriter -> Array { | r} -> Aff Unit
writeRecords writer records = liftEffect (_writeRecords writer records) >>= toAff
