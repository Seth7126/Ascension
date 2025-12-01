// 函数: _ZN14ascensionrules22CStateMustPayResources10EnterStateER13CStateMachine
// 地址: 0x1521c4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPayResourceState* r0 = *(arg1 + 0x24c)
int32_t r1 = *(arg1 + 0x250)
int32_t r2 = *(arg1 + 0x54)
int32_t r3 = *(arg1 + 0x58)
int32_t r5 = *(arg1 + 0x5c)
int32_t r7_1 = *(arg1 + 0x60)
uint16_t r9 = 0
int32_t r6 = *(arg1 + 0x264)
int32_t r12 = *(arg1 + 0x268)
*(arg1 + 0x26c) = 0
*(arg1 + 0x270) = r1
*(arg1 + 0x280) = r3 + r2 + r5
*(arg1 + 0x84) = r2
*(arg1 + 0x88) = r3
*(arg1 + 0x8c) = r5
*(arg1 + 0x90) = r7_1
*(arg1 + 0x294) = r6
*(arg1 + 0x298) = r12
ascension::CPlayer::SetPayResourceState(r0)

if (*(arg1 + 0x254) s<= 0 && *(arg1 + 0x258) s<= 0 && *(arg1 + 0x25c) s<= 0
        && *(*(*(arg1 + 0x24c) + 4) + 0x30) u>= 0x18)
    *(arg1 + 0x26c) = 1
    return 1

void* r0_4 = *(arg1 + 0x250)

if (r0_4 != 0)
    r9 = *(r0_4 + 8)

int32_t var_24 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, r9, 0xa0c0, "Pay Resources", 
    ascensionrules::CStateMustPayResources::SelectPay)
*(arg1 + 0x24c)
jump(*(*arg1 + 0x34))
