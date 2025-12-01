// 函数: _ZN14ascensionrules39GainEnergyForEachMechanaConstructInPlayEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x106830
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CInstance* r0_1 = ascension::CPlayer::CountConstructsInPlay(arg3, true, nullptr)
ascension::CWorld::OutputAnimationEnergy(arg2, r0_1, arg5)
ascension::CWorld::AddCurrentTurnEnergy(arg2)
return core::CWorldBase::OutputMessageFormat(arg2, "%s gains %d energy\n", (*(*arg3 + 0xc))(arg3), 
    r0_1) __tailcall
