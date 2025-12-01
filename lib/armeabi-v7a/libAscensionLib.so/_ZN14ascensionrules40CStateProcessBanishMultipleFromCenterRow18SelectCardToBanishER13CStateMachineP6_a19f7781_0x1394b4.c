// 函数: _ZN14ascensionrules40CStateProcessBanishMultipleFromCenterRow18SelectCardToBanishER13CStateMachineP6CStateiPj
// 地址: 0x1394b4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r5 = *(arg2 + 0x24c)
char* r9 = *(r5 + 4)
void* result = ascension::CWorld::GetCenterRowCard(r9)

if (result != 0)
    core::CWorldBase::OutputMessageFormat(r9, "%s banishes %s from center row\n", r5 + 0x10, 
        *(result + 0xc) + 4)
    int32_t* r0_3 = *(arg2 + 0x254)
    
    if (r0_3 != 0)
        void* r2_2 = r0_3 + *r0_3 + 4
        uint32_t r1_2 = zx.d(*r2_2)
        
        if (r1_2 u<= 7)
            uint32_t r3_1 = zx.d(*(result + 8))
            *r2_2 = r1_2.b + 1
            r0_3[*r0_3 * 8 + r1_2 + 4] = r3_1
    
    void** r0_6 = operator new(0x9c)
    CState::CState()
    *r0_6 = _vtable_for_ascensionrules::CStateProcessBanishSequence + 8
    r0_6[0xc] = r5
    r0_6[0xd] = result
    r0_6[0xe] = 7
    r0_6[0xf] = arg3
    r0_6[0x10].b = 0
    r0_6[0x11] = _vtable_for_ascension::CEventBanishCard + 8
    r0_6[0x12] = 0x1d
    r0_6[0x13] = 0
    r0_6[0x24] = r5
    r0_6[0x25] = 0
    r0_6[0x26] = 0
    CStateMachine::PushOwnedState(arg1)
    ascension::CWorld::RemoveCenterRowCard(r9, arg3.b)
    *(arg2 + arg3 + 0x278) = 1
    result = *(arg2 + 0x258) + 1
    *(arg2 + 0x258) = result

return result
