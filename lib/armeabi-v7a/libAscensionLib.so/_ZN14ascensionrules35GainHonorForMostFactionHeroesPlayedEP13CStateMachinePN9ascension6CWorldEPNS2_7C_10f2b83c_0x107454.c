// 函数: _ZN14ascensionrules35GainHonorForMostFactionHeroesPlayedEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x107454
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_1 = ascension::CWorld::GetPlayedHeroCount(arg2, 1, nullptr)
int32_t r4 = r0_1 & not.d(r0_1 s>> 0x1f)
int32_t r0_3 = ascension::CWorld::GetPlayedHeroCount(arg2, 2, nullptr)

if (r0_3 s> r4)
    r4 = r0_3

int32_t r0_5 = ascension::CWorld::GetPlayedHeroCount(arg2, 3, nullptr)

if (r0_5 s> r4)
    r4 = r0_5

int32_t r0_7
ascension::CWorld* r1
r0_7, r1 = ascension::CWorld::GetPlayedHeroCount(arg2, 4, nullptr)

if (r0_7 s> r4)
    r4 = r0_7

return ascensionrules::GainHonor(arg1, r1, arg3, r4 * arg4, arg5)
