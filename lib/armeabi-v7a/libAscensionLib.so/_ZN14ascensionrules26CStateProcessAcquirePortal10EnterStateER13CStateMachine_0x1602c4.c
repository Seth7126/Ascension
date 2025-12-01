// 函数: _ZN14ascensionrules26CStateProcessAcquirePortal10EnterStateER13CStateMachine
// 地址: 0x1602c4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r7 = *(arg1 + 0x24c)
int32_t* r0 = *(arg1 + 0x250)
*(arg1 + 0x264) = 0x100
*(arg1 + 0x260) = 0
*(arg1 + 0x266) = 0
char* r5 = *(r7 + 4)
core::CWorldBase::OutputMessageFormat(r5, "%s acquires %s\n", r7 + 0x10, (*(*r0 + 0xc))())
ascension::CWorld::PushResolveEffect(r5, *(arg1 + 0x250))
uint32_t var_28 = zx.d(*(*(arg1 + 0x24c) + 8))
ascension::CWorld::OutputAnimationCard(r5, *(arg1 + 0x50), 3, *(arg1 + 0x54), *(arg1 + 0x258), 0xb, 
    0, 1)

if (*(arg1 + 0x254) == 0xc)
    *(arg1 + 0x250)
    ascension::CWorld::PopRevealCard(r5)

ascension::CWorld::OutputPauseForAnimationToDestination(r5)
int32_t var_38_1 = 0
return ascension::CWorld::OutputEvent(r5, 4, zx.d(*(*(arg1 + 0x24c) + 8)), 
    zx.d(*(*(arg1 + 0x250) + 8)))
