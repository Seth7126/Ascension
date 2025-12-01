// 函数: _ZN14ascensionrules55AcquireHeroOrConstructWithCostLessThanMechanaConstructsEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10ad2c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_1 = ascension::CPlayer::CountConstructsInPlay(arg3, true, nullptr)
int32_t temp0 = 0
uint32_t i = *(arg2 + 0x30) - 0x19

while (i != 0)
    i u>>= 1
    temp0 += 1

ascensionrules::CreateStateProcessAcquireHeroOrConstruct(arg3, false, false, false, true, true, 
    false, 0, r0_1, ((0x20 - temp0) u>> 5).b)
return CStateMachine::PushListState(arg1) __tailcall
