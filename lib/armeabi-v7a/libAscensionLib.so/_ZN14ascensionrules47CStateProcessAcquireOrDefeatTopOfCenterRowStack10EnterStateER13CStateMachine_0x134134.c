// 函数: _ZN14ascensionrules47CStateProcessAcquireOrDefeatTopOfCenterRowStack10EnterStateER13CStateMachine
// 地址: 0x134134
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(arg1 + 0x250)
int32_t r6 = *(*(arg1 + 0x24c) + 4)
int32_t r0_2 = ascension::CWorld::GetCenterRowCard(r6)
*(arg1 + 0x250)
*(arg1 + 0x258) = r0_2
ascension::CWorld::FlipCenterRowCard(r6)
*(arg1 + 0x250)
int32_t* r0_5 = ascension::CWorld::GetCenterRowCardStackList(r6)
int32_t* r1_3 = *r0_5
int32_t r0_6 = r0_5[1]

if (r1_3 != r0_6 && *(r0_6 - 4) == 3 && r1_3[1] == 2)
    core::CCardInstance* r1_5 = *(arg1 + 0x250)
    *(arg1 + 0x258) = *r1_3
    ascension::CWorld::RemoveCenterRowCard(r6, r1_5)
    ascension::CWorld::PutCardOnCenterRow(r6, *(arg1 + 0x250), *(arg1 + 0x258))

*(arg1 + 0x25c) = 0
return ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStack::BuildOptionList(arg1)
    __tailcall
