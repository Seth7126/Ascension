// 函数: _ZN14ascensionrules39CStateProcessAcquireAllCenterRowPortals19BuildAcquireOptionsER13CStateMachine
// 地址: 0x161cf8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t i = 0
int32_t r6 = *(*(arg1 + 0x24c) + 4)

do
    if (zx.d(*(arg1 + 0x270 + i)) == 0)
        void* r8_1 = arg1 + 0x270 + (i << 2)
        
        if (*(r8_1 - 0x1c) != 0)
            void* r0_3 = ascension::CWorld::GetCenterRowCard(r6)
            
            if (r0_3 != *(r8_1 - 0x1c))
                *(r8_1 - 0x1c) = 0
            else if (*(*(r0_3 + 0xc) + 0x88) == 8)
                int32_t i_1 = i
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_3 + 8), 0xa02d, "Acquire %s", 
                    ascensionrules::CStateProcessAcquireAllCenterRowPortals::SelectAcquireToDiscard)
    
    i += 1
while (i != 7)

if (*(arg1 + 0x38) s<= 0)
    *(arg1 + 0x250) = 1
    return 1

*(arg1 + 0x24c)
jump(*(*arg1 + 0x34))
