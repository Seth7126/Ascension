// 函数: _ZN14ascensionrules40RevealCenterDeckPlaceTreasureUnderTrophyEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x112b2c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* result = *(arg3 + 0x60)
int32_t r1 = *(arg3 + 0x64)

if (result != r1)
    do
        ascension::CTrophyInstance* r4_1 = *result
        
        if (*(r4_1 + 0x10) == arg5)
            if (r4_1 == 0)
                break
            
            ascensionrules::CreateStateRevealPortalDeckAndPlaceTreasureUnderTrophy(arg3, arg4, r4_1)
            return CStateMachine::PushListState(arg1) __tailcall
        
        result = &result[1]
    while (r1 != result)

return result
