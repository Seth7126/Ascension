// 函数: _ZN14ascensionrules21IfTopOfDeckIsTreasureEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x101258
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (zx.d(*(arg1 + 0xa14)) != 0 && *(arg2 + 0x9c) == 0 && *(*(arg2 + 0x38) + 0x18) s> 1)
    return 0

int32_t* r0_5 = ascension::CPlayer::RevealTopCardFromDeck(arg2.b)

if (r0_5 == 0)
    return 0

core::CWorldBase::OutputMessageFormat(arg1, "%s reveals "%s"\n", arg2 + 0x10, 
    (*(*r0_5 + 0xc))(r0_5))
int32_t temp0_1 = 0
uint32_t i = *(r0_5[3] + 0x88) - 6

while (i != 0)
    i u>>= 1
    temp0_1 += 1

return (0x20 - temp0_1) u>> 5
