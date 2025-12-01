// 函数: _ZN14ascensionrules37AddSeventhRowIfTreasureUnderCenterRowEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10f56c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CEvent* result = arg7

if (result != 0)
    result = __dynamic_cast(result, _typeinfo_for_ascension::CEvent, 
        _typeinfo_for_ascension::CEventEnterCenterRow, 0)
    
    if (result != 0)
        result = *(result + 0x5c) * arg4
        
        if (result != 0)
            ascension::CWorld::SetCenterRowSize(arg2)
            *(arg2 + 0xb14) = 7
            uint32_t i_2 = ascension::CWorld::RemoveCenterRowCard(arg2, true)
            
            if (i_2 != 0)
                uint32_t i_1 = i_2
                uint32_t i
                
                do
                    int32_t var_40_1 = 0
                    ascension::CWorld::OutputAnimationCard(arg2, i_1, 6, 7, 6, 9, 0, 
                        &(*__elf_header.ident.signature)[1])
                    ascension::CWorld::PutCardInVoid(arg2)
                    i = ascension::CWorld::RemoveCenterRowCard(arg2, true)
                    i_1 = i
                while (i != 0)
            
            ascensionrules::CreateStateRemoveCenterRowCard(arg3, 6, nullptr, true, false, 0, 0, 
                false, nullptr, nullptr, 0, nullptr, 0)
            return CStateMachine::PushListState(arg1) __tailcall

return result
