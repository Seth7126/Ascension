// 函数: _ZN14ascensionrules60IfCanAcquireHeroOrConstructWithCostLessThanMechanaConstructsEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x1020c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_1 = ascension::CPlayer::CountConstructsInPlay(arg2, true, nullptr)
int32_t temp0 = 0
uint32_t i = *(arg1 + 0x30) - 0x19

while (i != 0)
    i u>>= 1
    temp0 += 1

return ascensionrules::CanAcquireHeroOrConstruct(arg2, false, true, true, 0, r0_1, 
    ((0x20 - temp0) u>> 5).b)
