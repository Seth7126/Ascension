// 函数: _ZN14ascensionrules42EachOpponentRevealsHandGainHonorPerMonsterEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x11148c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CInstance* r4

if (arg5 == 0)
    r4 = nullptr
else
    r4 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)

int32_t result = *(arg2 + 0x1c) - *(arg2 + 0x18)

if (result s>= 5)
    int32_t r6_1 = result s>> 2
    int32_t r7_1 = 1
    
    do
        ascensionrules::CreateStateRevealOpponentHandGainHonorPerMonster(arg3, 
            ascension::CWorld::GetPlayerByTurnOrder(arg2, arg3), arg4, r4)
        result = CStateMachine::PushListState(arg1)
        r7_1 += 1
    while (r7_1 s< r6_1)

return result
