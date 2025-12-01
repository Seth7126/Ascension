// 函数: _ZN14ascensionrules42GainHonorForEachLifeboundHeroAlreadyPlayedEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x107408
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_1
ascension::CWorld* r1
r0_1, r1 = ascension::CWorld::GetPlayedHeroCount(arg2, 2, nullptr)
return ascensionrules::GainHonor(arg1, r1, arg3, r0_1 * arg4, arg5)
